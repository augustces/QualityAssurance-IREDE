package suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormWeb {
    public static WebDriver createChromeDriver(){
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://the-internet.herokuapp.com/login");
        return navegador;
    }
}
