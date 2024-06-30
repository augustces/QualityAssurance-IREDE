package pages;

import org.openqa.selenium.WebDriver;

// Página base para as demais
public class BasePage {
    protected WebDriver navegador;

    public BasePage (WebDriver navegador){
        this.navegador = navegador;
    }
}
