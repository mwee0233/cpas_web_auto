package functions;

import pages.DisplayPage;

public class PageDisplayFunction extends DisplayPage {

          private PageDisplayFunction(){}

        private static PageDisplayFunction pageDisplay = new PageDisplayFunction();


    public static boolean isPageTitleDisplayed(){
        DisplayPage.switchToDashboardIframe();
        boolean title = pageDisplay.isDisplayedPageTitle();
                return title;
    }


    public static boolean isPageTitleDisplayedPopUp(){
        DisplayPage.switchToDashboardIframe();
        boolean title = pageDisplay.isDisplayedPageTitlePopUp();
        return title;
    }

}
