package functions;

import pages.LinksPage;

public class LinksFunction {
    private LinksFunction(){}
    private static LinksPage links = new LinksPage();

    public static void clickMainLink(){

        links.clickMainLink();
    }

}
