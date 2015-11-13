package com.github.cmanou.scrimage.utils.dithering

import java.io.File

import com.github.cmanou.scrimage.utils.dithering.filters._
import com.sksamuel.scrimage._
import com.sksamuel.scrimage.nio.{ PngWriter, JpegWriter }
import org.apache.commons.io.FileUtils

import scala.concurrent.ExecutionContext.Implicits.global

object ExampleGenerator extends App {

  val image1 = Image.fromStream(getClass.getResourceAsStream("/macosx-desktop.png"))
  val image2 = Image.fromStream(getClass.getResourceAsStream("/companion-cube.jpg"))

  val filters: List[(String, Filter)] = List(
    ("atkinson", AtkinsonFilter()),
    ("burkes", BurkesFilter()),
    ("floyd-steinberg", FloydSteinbergFilter()),
    ("jarvis-judice-ninke", JJNFilter()),
    ("stucki", StuckiFilter())
  )

  val sb = new StringBuffer()

  for (filter <- filters) {

    val filterName = filter._1

    sb.append("\n| " + filterName + " | ")

    for (t <- List(("MacOSXDesktop", image1), ("CompanionCube", image2))) {

      val filename = t._1
      val image = t._2
      val large = image.scaleToWidth(1200)
      val small = image.scaleToWidth(200)

      println("Generating example " + filename + " " + filterName)
      large.filter(filter._2).output(new File("examples/dithering/" + filename + "_" + filterName + "_large.jpeg"))(JpegWriter.NoCompression)
      small.filter(filter._2).forWriter(PngWriter.MaxCompression)
        .write(new File("examples/dithering/" + filename + "_" + filterName + "_small.png"))

      sb.append(s"<a href='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/${filename}_${filterName}_large.jpeg'><img src='https://raw.github.com/cmanou/scrimage-utils/master/examples/dithering/${filename}_${filterName}_small.png'><a/> | ")
    }
  }

  FileUtils.write(new File("filters.md"), sb.toString)
}