package com.github.cmanou.scrimage.utils.dithering.filters

import com.github.cmanou.scrimage.utils.dithering.Utils.ErrorDiffusionValue
import com.github.cmanou.scrimage.utils.dithering.algorithms.GenericErrorDiffusion
import com.sksamuel.scrimage.filter.MarvinFilter

class AtkinsonFilter(threshold: Int) extends MarvinFilter {
  val plugin = new GenericErrorDiffusion(threshold, List(
    ErrorDiffusionValue(1,0, 0.125),
    ErrorDiffusionValue(1,1, 0.125),
    ErrorDiffusionValue(2,0, 0.125),
    ErrorDiffusionValue(0,1, 0.125),
    ErrorDiffusionValue(-1,1, 0.125),
    ErrorDiffusionValue(0,2, 0.125)
  ))
}
object AtkinsonFilter {
  def apply(): AtkinsonFilter = apply(127)
  def apply(threshold: Int = 0): AtkinsonFilter = new AtkinsonFilter(threshold)
}


