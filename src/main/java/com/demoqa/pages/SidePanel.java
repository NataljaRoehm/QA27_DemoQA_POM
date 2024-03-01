package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {

  public SidePanel(WebDriver driver) {
    super(driver);
  }

  @FindBy(xpath = "//span[.='Alerts']")
  WebElement alerts;

  public AlertsPage selectAlerts() {
    clickWithJS(alerts, 0, 300);
    return new AlertsPage(driver);
  }

  @FindBy(xpath = "//span[.='Browser Windows']")
  WebElement browserWindows;

  public BrowserWindowPage selectBrowserWindows() {
    clickWithJS(browserWindows, 0, 300);
    return new BrowserWindowPage(driver);
  }

  @FindBy(xpath = "//span[.='Select Menu']")
  WebElement selectMenu;

  public SelectPage getSelect() {
    clickWithJS(selectMenu, 0, 700);
    return new SelectPage(driver);
  }

  @FindBy(xpath = "//span[.='Practice Form']")
  WebElement practiceForm;

  public PracticeFormPage selectPracticeForm() {
    click(practiceForm);
    return new PracticeFormPage(driver);
  }
}