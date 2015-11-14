package com.github.cmanou.scrimage.utils.dithering.filters

import com.sksamuel.scrimage.Image
import org.scalatest.{BeforeAndAfter, FunSuite, OneInstancePerTest}

class Ordered4x4BayerFilterTest extends FunSuite with BeforeAndAfter with OneInstancePerTest {

  val original = Image.fromStream(getClass.getResourceAsStream("/macosx-desktop.png"))

  test("filter output matches expected") {
    val expected = Image.fromStream(getClass.getResourceAsStream("/com/github/cmanou/scrimage/utils/dithering/filters/macosx-desktop-bayer4x4.png"))
    assert(original.filter(Ordered4x4BayerFilter()) === expected)
  }
}