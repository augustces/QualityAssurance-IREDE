import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.FormPage;
import suport.FormWeb;

public class FormTest {
    private WebDriver navegador;

    @BeforeTest
    public void setUp(){
        navegador = FormWeb.createChromeDriver();
    }

    @Test
    public void signIn(){
        new FormPage(navegador)
        .Username("tomsmith")
        .Password("SuperSecretPassword!")
        .Logged();
    }

    @AfterTest
    public void tearDown(){
        navegador.quit();
    }
}
