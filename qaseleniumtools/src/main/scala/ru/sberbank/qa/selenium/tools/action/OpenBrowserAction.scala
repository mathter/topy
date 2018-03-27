package ru.sberbank.qa.selenium.tools.action

import java.awt.event.ActionEvent
import javax.swing.AbstractAction

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.events.EventFiringWebDriver
import ru.sberbank.qa.selenium.tools.Main

class OpenBrowserAction extends AbstractAction("Open Browser") {

  override def isEnabled = true

  override def actionPerformed(e: ActionEvent) = {
    if (this.isEnabled) {
      Main.webDriver = Option(new EventFiringWebDriver(new FirefoxDriver()))

      Main.webDriver.map(_.get("http://sbt-okdbo-009.sigma.sbrf.ru:8292/ic/dcb-gucci/"))
    }
  }
}
