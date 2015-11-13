package com.github.cmanou.scrimage.utils.dithering.filters

import com.github.cmanou.scrimage.utils.dithering.Utils
import com.sksamuel.scrimage.filter.MarvinFilter
import Utils.ErrorDiffusionValue
import com.github.cmanou.scrimage.utils.dithering.algorithms.GenericErrorDiffusion

class StuckiFilter(threshold: Int) extends MarvinFilter {
  val plugin = new GenericErrorDiffusion(threshold, List(
    ErrorDiffusionValue(1,0, 0.19047619047619),
    ErrorDiffusionValue(2,0, 0.0952380952381),
    ErrorDiffusionValue(-2,1, 0.04761904761905),
    ErrorDiffusionValue(-1,1, 0.0952380952381),
    ErrorDiffusionValue(0,1, 0.19047619047619),
    ErrorDiffusionValue(1,1, 0.0952380952381),
    ErrorDiffusionValue(2,1, 0.04761904761905),
    ErrorDiffusionValue(-2,2, 0.02380952380952),
    ErrorDiffusionValue(-1,2, 0.04761904761905),
    ErrorDiffusionValue(0,2, 0.0952380952381),
    ErrorDiffusionValue(1,2, 0.04761904761905),
    ErrorDiffusionValue(2,2, 0.02380952380952)
  ))
}
object StuckiFilter {
  def apply(): StuckiFilter = apply(127)
  def apply(threshold: Int = 0): StuckiFilter = new StuckiFilter(threshold)
}