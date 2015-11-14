package com.github.cmanou.scrimage.utils.dithering.filters

import com.github.cmanou.scrimage.utils.dithering.Utils.ErrorDiffusionValue
import com.github.cmanou.scrimage.utils.dithering.algorithms.GenericErrorDiffusion
import com.sksamuel.scrimage.filter.MarvinFilter

class TwoRowSierraFilter(threshold: Int) extends MarvinFilter {
  val plugin = new GenericErrorDiffusion(threshold, List(
    ErrorDiffusionValue(1,0, 0.25),
    ErrorDiffusionValue(2,0, 0.1875),
    ErrorDiffusionValue(-2,1, 0.0625),
    ErrorDiffusionValue(-1,1, 0.125),
    ErrorDiffusionValue(0,1, 0.1875),
    ErrorDiffusionValue(1,1, 0.125),
    ErrorDiffusionValue(2,1, 0.0625)
  ))
}

object TwoRowSierraFilter {
  def apply(): TwoRowSierraFilter = apply(127)
  def apply(threshold: Int = 0): TwoRowSierraFilter = new TwoRowSierraFilter(threshold)
}
