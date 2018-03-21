package functions;


import common.Constants;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.LoadPage;
import utils.DriverEnviromentSetUpUtil;

public class LoadFunction {
    private static LoadPage loadPage = new LoadPage();

    private LoadFunction() {
    }


    public static void loadLoadPage() {
        if (Constants.RUN_LOCALLY) {
            DriverEnviromentSetUpUtil.setToRunLocallyWithBrowser(Constants.BROWSER_TYPE);
            DesiredCapabilities capabilities = null;
            loadPage.loadLoginPage(capabilities);
        } else {
            loadPage.loadLoginPage(DriverEnviromentSetUpUtil.setToRunRemotely());
        }
    }

    public static void loadPagePopUpPage() {
        if (Constants.RUN_LOCALLY) {
            DriverEnviromentSetUpUtil.setToRunLocallyWithBrowser(Constants.BROWSER_TYPE);
            DesiredCapabilities capabilities = null;
            loadPage.loadPopUpPage(capabilities);
        } else {
            loadPage.loadPopUpPage(DriverEnviromentSetUpUtil.setToRunRemotely());
        }
    }

    public static void SearchAWord() {
        loadPage.enterWord(Constants.WORD);
        loadPage.clickGoogleSearch();

    }

    public static void EnterCustID() {
        loadPage.enterCustIDPopUp(Constants.CUST_ID);
        loadPage.clickSubmitButton();

    }

        public static void quiteDriver(){
        loadPage.quiteDriver();
    }}


   
