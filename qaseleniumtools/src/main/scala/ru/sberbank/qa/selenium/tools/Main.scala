package ru.sberbank.qa.selenium.tools

import java.util
import java.util.List

import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.RemoteWebElement
import org.openqa.selenium.support.events.EventFiringWebDriver


object Main {
  def main(args: Array[String]): Unit = {
    System.setProperty("webdriver.gecko.driver", "./geckodriver")
    val webDriver: EventFiringWebDriver = new EventFiringWebDriver(new FirefoxDriver())

    webDriver.get("http://lenta.ru")
    webDriver.executeScript("document.onclick = function(e) { alert(e.target) }")

//    val element: WebElement = webDriver.findElement(By.tagName("body")).asInstanceOf[WebElement]
//
//    val l: util.List[WebElement] = element.findElements(By.tagName("div"))
//    println(l)

    //    val html: WebElement = webDriver.executeScript("return document").asInstanceOf[WebElement]
    //
    //    println(html.findElements(new ByTagName("p")))

  }
}
