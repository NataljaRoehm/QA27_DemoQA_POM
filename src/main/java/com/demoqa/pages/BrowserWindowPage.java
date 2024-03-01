package com.demoqa.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BrowserWindowPage extends BasePage{

  public BrowserWindowPage(WebDriver driver) {
    super(driver);
  }

  @FindBy(id = "tabButton")
  WebElement tabButton;

  public BrowserWindowPage switchToNextTab(int index) {
    clickWithJS(tabButton,0,100);

    List<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(index));
    return this;
  }

  @FindBy(id = "sampleHeading")
  WebElement sampleHeading;

  public BrowserWindowPage verifyTextFromNewTab(String text) {
    Assert.assertTrue(shouldHaveText(sampleHeading,text,10));
    return this;
  }

}