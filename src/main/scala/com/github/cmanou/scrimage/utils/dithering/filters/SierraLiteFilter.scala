package com.github.cmanou.scrimage.utils.dithering.filters

import com.github.cmanou.scrimage.utils.dithering.Utils.ErrorDiffusionValue
import com.github.cmanou.scrimage.utils.dithering.algorithms.GenericErrorDiffusion
import com.sksamuel.scrimage.filter.MarvinFilter

class SierraLiteFilter(threshold: Int) extends MarvinFilter {
  val plugin = new GenericErrorDiffusion(threshold, List(
    ErrorDiffusionValue(1,0, 0.5),
    ErrorDiffusionValue(-2,1, 0.25),
    ErrorDiffusionValue(-1,1, 0.25)
  ))
}

object SierraLiteFilter {
  def apply(): SierraLiteFilter = apply(127)
  def apply(threshold: Int = 0): SierraLiteFilter = new SierraLiteFilter(threshold)
}
