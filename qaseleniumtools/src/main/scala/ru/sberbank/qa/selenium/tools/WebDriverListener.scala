package ru.sberbank.qa.selenium.tools

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.support.events.AbstractWebDriverEventListener

class WebDriverListener extends AbstractWebDriverEventListener {
  override def beforeClickOn(element: WebElement, driver: WebDriver): Unit = {
    System.out.println(element)
  }

  override def afterSwitchToWindow(windowName: String, driver: WebDriver): Unit = System.out.println(windowName)

  override def onException(throwable: Throwable, driver: WebDriver): Unit = System.out.println(throwable)

  override def beforeAlertAccept(driver: WebDriver): Unit = super.beforeAlertAccept(driver)

  override def afterScript(script: String, driver: WebDriver): Unit = System.out.println(script)

  override def afterFindBy(by: By, element: WebElement, driver: WebDriver): Unit = System.out.println(by + " " + element)

  override def beforeNavigateRefresh(driver: WebDriver): Unit = System.out.println(driver)

  override def beforeSwitchToWindow(windowName: String, driver: WebDriver): Unit = System.out.println(windowName)

  override def afterNavigateBack(driver: WebDriver): Unit = System.out.println(driver)

  override def afterNavigateForward(driver: WebDriver): Unit = super.afterNavigateForward(driver)

  override def afterNavigateRefresh(driver: WebDriver): Unit = super.afterNavigateRefresh(driver)

  override def beforeChangeValueOf(element: WebElement, driver: WebDriver, keysToSend: Array[CharSequence]): Unit = super.beforeChangeValueOf(element, driver, keysToSend)

  override def afterAlertDismiss(driver: WebDriver): Unit = super.afterAlertDismiss(driver)

  override def afterChangeValueOf(element: WebElement, driver: WebDriver, keysToSend: Array[CharSequence]): Unit = super.afterChangeValueOf(element, driver, keysToSend)

  override def beforeNavigateBack(driver: WebDriver): Unit = super.beforeNavigateBack(driver)

  override def afterNavigateTo(url: String, driver: WebDriver): Unit = super.afterNavigateTo(url, driver)

  override def beforeNavigateTo(url: String, driver: WebDriver): Unit = super.beforeNavigateTo(url, driver)

  override def beforeAlertDismiss(driver: WebDriver): Unit = super.beforeAlertDismiss(driver)

  override def afterClickOn(element: WebElement, driver: WebDriver): Unit = super.afterClickOn(element, driver)

  override def afterAlertAccept(driver: WebDriver): Unit = super.afterAlertAccept(driver)

  override def beforeNavigateForward(driver: WebDriver): Unit = super.beforeNavigateForward(driver)

  override def beforeScript(script: String, driver: WebDriver): Unit = super.beforeScript(script, driver)

  override def beforeFindBy(by: By, element: WebElement, driver: WebDriver): Unit = super.beforeFindBy(by, element, driver)
}
