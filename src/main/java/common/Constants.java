package common;


public class Constants {
    public static final boolean UPDATE_DASHBOARD = Boolean.parseBoolean(System.getProperty("update.dashboard", "true"));
    public static final boolean RUN_LOCALLY = Boolean.parseBoolean(System.getProperty("run.locally", "true"));


    public static final String TEST_ENV = System.getProperty("test.env", "test");
    public static final String TEST_RELEASE = System.getProperty("test.release", "test_results_ie");
    public static final String TEST_PROJECT = System.getProperty("test.project", "google_test");
    public static final String BROWSER_IE = "internet explorer";
    public static final String BROWSER_FIREFOX="firefox";
    public static final String BROWSER_CHROME="chrome";
    public static final String GOOGLE_URL = System.getProperty("url.google", "https://www.google.lk");
    public static final String BASE_POPUP_URL = System.getProperty("url.PopUp", "http://demo.guru99.com/test/delete_customer.php");
    //public static final String BROWSER_TYPE = System.getProperty("browser.type","chrome");
    public static final String WORD = System.getProperty("Word", "Selenium");
    public static final String CUST_ID = System.getProperty("url.cust.portal.custid", "1");

    public static final String BROWSER_TYPE = System.getProperty("browser.type","firefox");

    //public static final String UN = System.getProperty("url.customer.portal.un", "mwee0233");




}
