package com.github.cmanou.scrimage.utils.dithering.filters

import org.scalatest.{ OneInstancePerTest, BeforeAndAfter, FunSuite }
import com.sksamuel.scrimage.Image

class FloydSteinbergFilterTest extends FunSuite with BeforeAndAfter with OneInstancePerTest {

  val original = Image.fromStream(getClass.getResourceAsStream("/macosx-desktop.png"))

  test("filter output matches expected") {
    val expected = Image.fromStream(getClass.getResourceAsStream("/com/github/cmanou/scrimage/utils/dithering/filters/macosx-desktop-floyd-steinberg.png"))
    assert(original.filter(FloydSteinbergFilter()) === expected)
  }
}