package com.github.cmanou.scrimage.utils.dithering.filters

import com.sksamuel.scrimage.filter.MarvinFilter
import com.github.cmanou.scrimage.utils.dithering.algorithms.GenericMatrixDither

class Ordered4x4BayerFilter(threshold: Int) extends MarvinFilter {
  val plugin = new GenericMatrixDither(threshold,
    Array(
      Array(1,9,3,11),
      Array(13,5,15,7),
      Array(4,12,2,10),
      Array(16,8,14,6)
    ),
    4)
}
object Ordered4x4BayerFilter {
  def apply(): Ordered4x4BayerFilter = apply(127)
  def apply(threshold: Int = 0): Ordered4x4BayerFilter = new Ordered4x4BayerFilter(threshold)
}