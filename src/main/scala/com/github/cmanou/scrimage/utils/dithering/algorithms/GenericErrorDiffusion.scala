package com.github.cmanou.scrimage.utils.dithering.algorithms

import com.github.cmanou.scrimage.utils.dithering.Utils
import com.github.cmanou.scrimage.utils.dithering.Utils.ErrorDiffusionValue

import thirdparty.marvin.image._
import thirdparty.marvin.image.grayScale.GrayScale

case class GenericErrorDiffusion(threshold: Int, errorDiffusionValues: List[ErrorDiffusionValue]) extends MarvinAbstractImagePlugin {

  override def process(imgIn: MarvinImage, imgOut: MarvinImage, attrOut: MarvinAttributes, mask: MarvinImageMask, previewMode: Boolean): Unit = {
    var currentColor = 0
    var currentDifference = 0.0

    //First We GrayScale the image
    val grayScaleFilter = new GrayScale
    grayScaleFilter.process(imgIn, imgOut, attrOut, mask, previewMode)

    //Now we go and apply the error diffusion
    val maskArray = mask.getMaskArray

    for (y <- 0 until imgOut.getHeight; x <- 0 until imgOut.getWidth) {
      if (maskArray == null || (maskArray != null && maskArray(x)(y))) {
        //Set the current pixel to either black or white based on threshold
        currentColor = imgOut.getIntComponent0(x, y)
        if (currentColor > threshold) {
          imgOut.setIntColor(x, y, imgIn.getAlphaComponent(x, y), 255, 255, 255)
          currentDifference = -(255 - currentColor)
        } else {
          imgOut.setIntColor(x, y, imgIn.getAlphaComponent(x, y), 0, 0, 0)
          currentDifference = currentColor
        }

        //Now Add the error to all corresponding pixels
        errorDiffusionValues.foreach { eDV =>
          if (x + eDV.x > 0 && x + eDV.x < imgOut.getWidth && y + eDV.y > 0 && y + eDV.y < imgOut.getHeight) {
            currentColor = imgOut.getIntComponent0(x + eDV.x, y + eDV.y)
            currentColor += Math.round(eDV.error * currentDifference).toInt
            currentColor = Utils.getValidGray(currentColor)
            imgOut.setIntColor(x + eDV.x, y + eDV.y, imgIn.getAlphaComponent(x + eDV.x, y + eDV.y), currentColor, currentColor, currentColor)
          }
        }
      }
    }
  }
}

