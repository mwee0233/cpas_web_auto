package pages;

import common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;



public class DisplayPage extends LoadPage {

    private By pageTitle = By.xpath("//*[@id=\"mainContent\"]/h2[1]");
    private By pageTitlePopUp = By.xpath("//*[@id=\"site-name\"]/a");


    public boolean isDisplayedPageTitle() {

        return loadPage.isDisplayed(pageTitle);
    }

    public boolean isDisplayedPageTitlePopUp() {

        return loadPage.isDisplayed(pageTitlePopUp);
    }



    public static void switchToDashboardIframe() {
        if(Constants.BROWSER_TYPE.equals(Constants.BROWSER_IE) || (Constants.BROWSER_TYPE.equals(Constants.BROWSER_FIREFOX)) ){
            loadPage.sleep(5);
            loadPage.switchToDefaultFrame();
        }

    }



}
