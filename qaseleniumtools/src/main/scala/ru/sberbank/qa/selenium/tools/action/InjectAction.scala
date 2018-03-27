package ru.sberbank.qa.selenium.tools.action

import java.awt.event.ActionEvent
import javax.swing.AbstractAction

import org.apache.commons.io.FileUtils
import ru.sberbank.qa.selenium.tools.Main

import scala.util.Try

class InjectAction extends AbstractAction("Inject") {

  override def isEnabled = true

  override def actionPerformed(e: ActionEvent) = {
    val file = FileUtils.toFile(Main.getClass.getResource("script.js"))
    val script = FileUtils.readFileToString(file)

    Main.webDriver.map(_.executeScript(script))
  }
}
