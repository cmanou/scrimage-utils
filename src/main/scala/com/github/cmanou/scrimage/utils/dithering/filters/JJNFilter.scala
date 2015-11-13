package com.github.cmanou.scrimage.utils.dithering.filters

import com.github.cmanou.scrimage.utils.dithering.Utils
import com.sksamuel.scrimage.filter.MarvinFilter
import Utils.ErrorDiffusionValue
import com.github.cmanou.scrimage.utils.dithering.algorithms.GenericErrorDiffusion

class JJNFilter(threshold: Int) extends MarvinFilter {
  val plugin = new GenericErrorDiffusion(threshold, List(
    ErrorDiffusionValue(1,0, 0.1458333333),
    ErrorDiffusionValue(2,0, 0.1041666667),
    ErrorDiffusionValue(-2,1, 0.0625),
    ErrorDiffusionValue(-1,1, 0.1041666667),
    ErrorDiffusionValue(0,1, 0.1458333333),
    ErrorDiffusionValue(1,1, 0.1041666667),
    ErrorDiffusionValue(2,1, 0.0625),
    ErrorDiffusionValue(-2,2, 0.02083333333),
    ErrorDiffusionValue(-1,2, 0.0625),
    ErrorDiffusionValue(0,2, 0.1041666667),
    ErrorDiffusionValue(1,2, 0.0625),
    ErrorDiffusionValue(2,2, 0.02083333333)
  ))
}
object JJNFilter {
  def apply(): JJNFilter = apply(127)
  def apply(threshold: Int = 0): JJNFilter = new JJNFilter(threshold)
}