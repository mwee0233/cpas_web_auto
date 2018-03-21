package pages;

import common.Constants;
import org.openqa.selenium.By;

public class LinksPage extends LoadPage {

    private By Mainlink = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a");



    public void clickMainLink() {
        loadPage.mouseHover(Mainlink);
        loadPage.click(Mainlink);

        }

    }
