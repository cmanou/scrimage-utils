package com.github.cmanou.scrimage.utils.dithering.algorithms

import com.github.cmanou.scrimage.utils.dithering.Utils
import com.github.cmanou.scrimage.utils.dithering.Utils.ErrorDiffusionValue
import thirdparty.marvin.image._
import thirdparty.marvin.image.grayScale.GrayScale

case class GenericMatrixDither(threshold: Int, bayerMatrix: Array[Array[Long]], bayerSize: Int) extends MarvinAbstractImagePlugin {

  override def process(imgIn: MarvinImage, imgOut: MarvinImage, attrOut: MarvinAttributes, mask: MarvinImageMask, previewMode: Boolean): Unit = {
    var currentColor = 0

    //First We GrayScale the image
    val grayScaleFilter = new GrayScale
    grayScaleFilter.process(imgIn, imgOut, attrOut, mask, previewMode)

    //Now we go and apply the error diffusion
    val maskArray = mask.getMaskArray
    val multiplier = Math.floorDiv(256,bayerSize*bayerSize)

    for (y <- 0 until imgOut.getHeight; x <- 0 until imgOut.getWidth) {
      if (maskArray == null || (maskArray != null && maskArray(x)(y))) {
        currentColor = Math.floor(imgOut.getIntComponent0(x, y) +  (multiplier*bayerMatrix(x%bayerSize)(y%bayerSize)) - 1).toInt
        if (currentColor > (threshold*2)) {
          imgOut.setIntColor(x, y, imgIn.getAlphaComponent(x, y), 255, 255, 255)
        } else {
          imgOut.setIntColor(x, y, imgIn.getAlphaComponent(x, y), 0, 0, 0)
        }

      }
    }
  }
}

