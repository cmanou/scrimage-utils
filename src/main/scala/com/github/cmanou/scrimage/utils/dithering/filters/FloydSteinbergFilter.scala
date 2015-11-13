package com.github.cmanou.scrimage.utils.dithering.filters

import com.github.cmanou.scrimage.utils.dithering.Utils
import com.github.cmanou.scrimage.utils.dithering.algorithms.GenericErrorDiffusion
import com.sksamuel.scrimage.filter.MarvinFilter
import Utils.ErrorDiffusionValue

class FloydSteinbergFilter(threshold: Int) extends MarvinFilter {
  val plugin = new GenericErrorDiffusion(threshold, List(
    ErrorDiffusionValue(1,0, 0.4375),
    ErrorDiffusionValue(1,1, 0.0625),
    ErrorDiffusionValue(0,1, 0.3125),
    ErrorDiffusionValue(-1,1, 0.1875)
  ))
}
object FloydSteinbergFilter {
  def apply(): FloydSteinbergFilter = apply(127)
  def apply(threshold: Int = 0): FloydSteinbergFilter = new FloydSteinbergFilter(threshold)
}