package pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

import java.util.ArrayList;


public class LoadPage extends SyscoLabUI{
    protected static SyscoLabUI loadPage;
    private By btnGoogleSearch= By.name("btnK");
    private By txtGoogleSearch  = By.name("q");
    private By txtCustID  = By.name("cusid");
    private By btnSubmit = By.name("submit");


    public static void loadLoginPage(Capabilities capabilities) {
        if(Constants.BROWSER_TYPE.equals(Constants.BROWSER_FIREFOX))
            loadPage = new SyscoLabWUI(capabilities, "FIREFOX");
        else if(Constants.BROWSER_TYPE.equals(Constants.BROWSER_IE))
            loadPage = new SyscoLabWUI(capabilities, "IE");
        else
            loadPage = new SyscoLabWUI(capabilities, "CHROME");
        loadPage.navigateTo(Constants.GOOGLE_URL);
//        loadPage.driver.manage().window().maximize();
    }

    public static void loadPopUpPage(Capabilities capabilities) {
        if(Constants.BROWSER_TYPE.equals(Constants.BROWSER_FIREFOX))
            loadPage = new SyscoLabWUI(capabilities, "FIREFOX");
        else if(Constants.BROWSER_TYPE.equals(Constants.BROWSER_IE))
            loadPage = new SyscoLabWUI(capabilities, "IE");
        else
            loadPage = new SyscoLabWUI(capabilities, "CHROME");
        loadPage.navigateTo(Constants.BASE_POPUP_URL);
        loadPage.driver.manage().window().maximize();
    }

    public void enterWord(String Word) {
       loadPage.sleep(5);
        if(Constants.BROWSER_TYPE.equals(Constants.BROWSER_TYPE)){
           loadPage.sleep(5);

        }
        loadPage.sendKeys(txtGoogleSearch,Word);
    }


    public void clickGoogleSearch() {
        loadPage.click(btnGoogleSearch);
        loadPage.sleep(5);
        if(Constants.BROWSER_TYPE.equals(Constants.BROWSER_FIREFOX)){
           loadPage.sleep(5);
            if(loadPage.isAlertDisplayed())
                loadPage.clickOkInWindowsAlert();}
    }

    public void enterCustIDPopUp(String cusid) {
        loadPage.sleep(5);
        if(Constants.BROWSER_TYPE.equals(Constants.BROWSER_TYPE)){
            loadPage.sleep(5);

        }
        loadPage.sendKeys(txtCustID, cusid);
    }

    public void clickSubmitButton() {
        loadPage.click(btnSubmit);
        loadPage.sleep(5);
        if(Constants.BROWSER_TYPE.equals(Constants.BROWSER_FIREFOX)){
            loadPage.sleep(5);
            if(loadPage.isAlertDisplayed())
                loadPage.clickOkInWindowsAlert();
            loadPage.sleep(5);
            if(loadPage.isAlertDisplayed())
                loadPage.clickOkInWindowsAlert();
        }

        if(loadPage.isAlertDisplayed())
            loadPage.clickOkInWindowsAlert();
           }


    public void quiteDriver() {
        if (loadPage.driver != null)
            loadPage.quit();
    }



}
