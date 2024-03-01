package com.demoqa.tests;

import com.demoqa.pages.BrowserWindowPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowTests extends TestBase{

  HomePage homePage;
  SidePanel sidePanel;
  BrowserWindowPage browserWindowPage;

  @BeforeMethod
  public void precondition() {
    homePage = new HomePage(driver);
    sidePanel = new SidePanel(driver);
    browserWindowPage = new BrowserWindowPage(driver);

    homePage.confirmCookies().getAlertsFrameWindows();//методом, предназначенным для подтверждения
                                            // cookie-соглашения на домашней странице
    sidePanel.selectBrowserWindows();
  }

  @Test
  public void switchToNewTabTest() {
    browserWindowPage.switchToNextTab(1).verifyTextFromNewTab("This is a sample page");
  }
}