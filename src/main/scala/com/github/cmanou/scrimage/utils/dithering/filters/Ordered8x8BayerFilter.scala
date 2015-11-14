package com.github.cmanou.scrimage.utils.dithering.filters

import com.sksamuel.scrimage.filter.MarvinFilter
import com.github.cmanou.scrimage.utils.dithering.algorithms.GenericMatrixDither

class Ordered8x8BayerFilter(threshold: Int) extends MarvinFilter {
  val plugin = new GenericMatrixDither(threshold,
    Array(
      Array(1,49,13,61,4,52,16,64),
      Array(33,17,45,29,36,20,48,32),
      Array(9,57,5,53,12,60,8,56),
      Array(41,25,37,21,44,28,40,24),
      Array(3,51,15,63,2,50,14,62),
      Array(35,19,47,31,34,18,46,30),
      Array(11,59,7,55,10,58,6,54),
      Array(43,27,39,23,42,26,38,22)
    ),
    8)
}
object Ordered8x8BayerFilter {
  def apply(): Ordered8x8BayerFilter = apply(127)
  def apply(threshold: Int = 0): Ordered8x8BayerFilter = new Ordered8x8BayerFilter(threshold)
}