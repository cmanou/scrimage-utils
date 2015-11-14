package com.github.cmanou.scrimage.utils.dithering.filters

import com.sksamuel.scrimage.Image
import org.scalatest.{BeforeAndAfter, FunSuite, OneInstancePerTest}

class Ordered8x8BayerFilterTest extends FunSuite with BeforeAndAfter with OneInstancePerTest {

  val original = Image.fromStream(getClass.getResourceAsStream("/macosx-desktop.png"))

  test("filter output matches expected") {
    val expected = Image.fromStream(getClass.getResourceAsStream("/com/github/cmanou/scrimage/utils/dithering/filters/macosx-desktop-bayer8x8.png"))
    assert(original.filter(Ordered8x8BayerFilter()) === expected)
  }
}