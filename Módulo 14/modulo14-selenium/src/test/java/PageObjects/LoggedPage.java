package PageObjects;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class LoggedPage extends BasePage{
    public LoggedPage(WebDriver navegador){
        super(navegador);
        String fullpage = navegador.getPageSource();
        String str = "You logged into a secure area!";
        assertTrue(fullpage.contains(str));
    }
}
