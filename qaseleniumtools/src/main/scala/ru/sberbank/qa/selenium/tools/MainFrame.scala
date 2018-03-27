package ru.sberbank.qa.selenium.tools

import java.awt.event.{WindowAdapter, WindowEvent}
import java.awt.{BorderLayout, Container}
import javax.swing.{JButton, JFrame, JToolBar}

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.events.EventFiringWebDriver
import ru.sberbank.qa.selenium.tools.action.{InjectAction, OpenBrowserAction}

import scala.util.Try

class MainFrame(title: String) extends JFrame(title) {

  private var _toolbar: JToolBar = _

  def this() = {
    this("Tools")
    System.setProperty("webdriver.gecko.driver", "./geckodriver")
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 200)
    this.addWindowListener(new WindowAdapter {
      override def windowClosing(e: WindowEvent) = {
        Main.webDriver.map(p => Try(p.close()))
      }
    })

    this.buildUI()
  }

  private def buildUI(): Unit = {
    val container: Container = this.getContentPane

    container.add(this.toolbar(), BorderLayout.NORTH)
  }

  private def toolbar(): JToolBar = {
    if (this._toolbar == null) {
      this._toolbar = new JToolBar()
      this._toolbar.setRollover(true)

      this._toolbar.add(new OpenBrowserAction)
      this._toolbar.addSeparator()
      this._toolbar.add(new InjectAction)
    }

    this._toolbar
  }
}