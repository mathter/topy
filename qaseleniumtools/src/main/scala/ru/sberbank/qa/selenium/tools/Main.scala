package ru.sberbank.qa.selenium.tools

import java.util
import java.util.List

import org.apache.commons.io.FileUtils
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.RemoteWebElement
import org.openqa.selenium.support.events.EventFiringWebDriver


object Main {

  var webDriver: Option[EventFiringWebDriver] = Option(null)

  def main(args: Array[String]): Unit = {
    val mainFrame: MainFrame = new MainFrame()

    mainFrame.setVisible(true)


    //    val file = FileUtils.toFile(Main.getClass.getResource("script.js"))
    //    val script = FileUtils.readFileToString(file)
    //
    //    System.setProperty("webdriver.gecko.driver", "./geckodriver")
    //    val webDriver: EventFiringWebDriver = new EventFiringWebDriver(new FirefoxDriver())
    //
    //    webDriver.get("http://sbt-okdbo-009.sigma.sbrf.ru:8292/ic/dcb-gucci/")
    //    webDriver.executeScript(script)

    //    val element: WebElement = webDriver.findElement(By.tagName("body")).asInstanceOf[WebElement]
    //
    //    val l: util.List[WebElement] = element.findElements(By.tagName("div"))
    //    println(l)

    //    val html: WebElement = webDriver.executeScript("return document").asInstanceOf[WebElement]
    //
    //    println(html.findElements(new ByTagName("p")))

  }
}
