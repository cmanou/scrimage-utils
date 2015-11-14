package com.github.cmanou.scrimage.utils.dithering.algorithms

import com.github.cmanou.scrimage.utils.dithering.Utils
import com.github.cmanou.scrimage.utils.dithering.Utils.ErrorDiffusionValue
import thirdparty.marvin.image._
import thirdparty.marvin.image.grayScale.GrayScale

case class RandomDither(seed: Option[Long] = None) extends MarvinAbstractImagePlugin {

  override def process(imgIn: MarvinImage, imgOut: MarvinImage, attrOut: MarvinAttributes, mask: MarvinImageMask, previewMode: Boolean): Unit = {
    var currentColor = 0

    //First We GrayScale the image
    val grayScaleFilter = new GrayScale
    grayScaleFilter.process(imgIn, imgOut, attrOut, mask, previewMode)

    //Now we go and apply the error diffusion
    val maskArray = mask.getMaskArray
    val random = seed match {
      case Some(s) => new scala.util.Random(s)
      case None => scala.util.Random
    }

    for (y <- 0 until imgOut.getHeight; x <- 0 until imgOut.getWidth) {
      if (maskArray == null || (maskArray != null && maskArray(x)(y))) {
        currentColor = imgOut.getIntComponent0(x, y)
        val threshold = random.nextInt(256)
        if (currentColor > threshold) {
          imgOut.setIntColor(x, y, imgIn.getAlphaComponent(x, y), 255, 255, 255)
        } else {
          imgOut.setIntColor(x, y, imgIn.getAlphaComponent(x, y), 0, 0, 0)
        }

      }
    }
  }
}

