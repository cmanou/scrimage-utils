package com.github.cmanou.scrimage.utils.dithering.filters

import com.github.cmanou.scrimage.utils.dithering.Utils
import com.github.cmanou.scrimage.utils.dithering.Utils.ErrorDiffusionValue
import com.github.cmanou.scrimage.utils.dithering.algorithms.GenericErrorDiffusion
import com.sksamuel.scrimage.filter.MarvinFilter

class SierraFilter(threshold: Int) extends MarvinFilter {
  val plugin = new GenericErrorDiffusion(threshold, List(
    ErrorDiffusionValue(1,0, 0.15625),
    ErrorDiffusionValue(2,0, 0.09375),
    ErrorDiffusionValue(-2,1, 0.0625),
    ErrorDiffusionValue(-1,1, 0.125),
    ErrorDiffusionValue(0,1, 0.15625),
    ErrorDiffusionValue(1,1, 0.125),
    ErrorDiffusionValue(2,1, 0.0625),
    ErrorDiffusionValue(-1,2, 0.0625),
    ErrorDiffusionValue(0,2, 0.09375),
    ErrorDiffusionValue(1,2, 0.0625)
  ))
}

object SierraFilter {
  def apply(): SierraFilter = apply(127)
  def apply(threshold: Int = 0): SierraFilter = new SierraFilter(threshold)
}