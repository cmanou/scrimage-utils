package com.github.cmanou.scrimage.utils.dithering.filters

import com.github.cmanou.scrimage.utils.dithering.Utils
import com.sksamuel.scrimage.filter.MarvinFilter
import Utils.ErrorDiffusionValue
import com.github.cmanou.scrimage.utils.dithering.algorithms.GenericErrorDiffusion

class BurkesFilter(threshold: Int) extends MarvinFilter {
  val plugin = new GenericErrorDiffusion(threshold, List(
    ErrorDiffusionValue(1,0, 0.25),
    ErrorDiffusionValue(2,0, 0.125),
    ErrorDiffusionValue(-2,1, 0.0625),
    ErrorDiffusionValue(-1,1, 0.125),
    ErrorDiffusionValue(0,1, 0.25),
    ErrorDiffusionValue(1,1, 0.125),
    ErrorDiffusionValue(2,1, 0.0625)
  ))
}
object BurkesFilter {
  def apply(): BurkesFilter = apply(127)
  def apply(threshold: Int = 0): BurkesFilter = new BurkesFilter(threshold)
}