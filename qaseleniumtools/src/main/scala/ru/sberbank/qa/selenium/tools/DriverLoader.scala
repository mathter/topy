package ru.sberbank.qa.selenium.tools

import java.net.URL
import java.nio.file.{Files, Path}

import org.apache.commons.io.FileUtils

import scala.util.Try

case class DriverLoader(val title: String, val url: URL) {
  def load(): Path = {
    val driversPath = Conf.webDriverPath()

    Try(this.url.openStream()).map(is => {
      val tmp = Files.createTempFile("driver", "")


      is.close()

      null
    }).get
  }
}


object DriverLoader {
  def drivers(): Array[DriverLoader] = {
    Array(new DriverLoader("FireFox v0.20.0 arm7hf", new URL("https://github.com/mozilla/geckodriver/releases/download/v0.20.0/geckodriver-v0.20.0-arm7hf.tar.gz")),
      new DriverLoader("FireFox v0.20.0 linux32", new URL("https://github.com/mozilla/geckodriver/releases/download/v0.20.0/geckodriver-v0.20.0-linux32.tar.gz")),
      new DriverLoader("FireFox v0.20.0 linux64", new URL("https://github.com/mozilla/geckodriver/releases/download/v0.20.0/geckodriver-v0.20.0-linux64.tar.gz")),
      new DriverLoader("FireFox v0.20.0 macos", new URL("https://github.com/mozilla/geckodriver/releases/download/v0.20.0/geckodriver-v0.20.0-macos.tar.gz")),
      new DriverLoader("FireFox v0.20.0 win32", new URL("https://github.com/mozilla/geckodriver/releases/download/v0.20.0/geckodriver-v0.20.0-win32.zip")),
      new DriverLoader("FireFox v0.20.0 win64", new URL("https://github.com/mozilla/geckodriver/releases/download/v0.20.0/geckodriver-v0.20.0-win64.zip"))
    )
  }
}
