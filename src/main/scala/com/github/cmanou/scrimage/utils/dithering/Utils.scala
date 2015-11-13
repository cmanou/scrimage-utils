package com.github.cmanou.scrimage.utils.dithering

object Utils {
  def getValidGray(a_value: Int): Int = {
    if (a_value < 0) return 0
    if (a_value > 255) return 255
    return a_value
  }

  case class ErrorDiffusionValue(x: Int, y: Int, error: Double)

}
