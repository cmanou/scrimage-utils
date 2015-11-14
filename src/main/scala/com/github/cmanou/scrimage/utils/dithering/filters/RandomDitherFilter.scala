package com.github.cmanou.scrimage.utils.dithering.filters

import com.github.cmanou.scrimage.utils.dithering.algorithms.{RandomDither}
import com.sksamuel.scrimage.filter.MarvinFilter

case class RandomDitherFilter(seed: Option[Long] = None) extends MarvinFilter {
  val plugin = new RandomDither(seed)
}

object RandomDitherFilter {
  def apply(): RandomDitherFilter = new RandomDitherFilter()
  def apply(seed: Long): RandomDitherFilter = new RandomDitherFilter(Some(seed))
}





