package com.syscolabs.uitest.qa.login;

import com.syscolabs.uitest.qa.utils.TestBase;
import functions.LinksFunction;
import functions.LoadFunction;
import functions.PageDisplayFunction;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogInToGoogle extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login Google");

    }

@Test(alwaysRun = true)
    public static void VerifyUserLoginToGoogle() {
    LoadFunction.loadLoadPage();
    LoadFunction.SearchAWord();
    LinksFunction.clickMainLink();
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertTrue(PageDisplayFunction.isPageTitleDisplayed(), "Couldn't navigate to page");
    softAssert.assertAll();
 }

    @Test(alwaysRun = true)
    public static void VerfyPopUpPage() {
        LoadFunction.loadPagePopUpPage();
        LoadFunction.EnterCustID();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(PageDisplayFunction.isPageTitleDisplayedPopUp(), "Couldn't navigate to page");
        softAssert.assertAll();
    }








    @AfterMethod
    public void closeDriver(){
        LoadFunction.quiteDriver();

    }
}
















