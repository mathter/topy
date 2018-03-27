package ru.sberbank.qa.selenium.tools

import java.nio.file.{Files, Path, Paths}

import scala.util.Try

object Conf {

  def confPath(): Path = {
    val path = Paths.get(System.getProperty("user.home")).resolve(".sbboltools/selenium")

    if (Files.isExecutable(path)) {
      path
    } else {
      Try(Files.createDirectories(path)).get
    }
  }

  def webDriverPath(): Path = {
    val path = confPath().resolve("drivers")

    if (Files.exists(path)) {
      path
    } else {
      Try(Files.createDirectories(path)).get
    }
  }
}