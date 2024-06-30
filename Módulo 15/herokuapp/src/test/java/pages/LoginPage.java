package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends BasePage{
    public LoginPage(){
        this.driver = new ChromeDriver();
        this.driver.get("https://the-internet.herokuapp.com/login");
    }

    public void clicarXpath(String xpath){
        this.driver.findElement(By.xpath(xpath)).click();
    }

    public void preencherCampos(String xpath, String texto){
        this.driver.findElement(By.xpath(xpath)).sendKeys(texto);
    }

    public boolean verificarTextoPorXpath(String xpath, String texto){
        return this.driver.findElement(By.xpath(xpath)).getText().equals(texto);
    }

    public void fechar(){
        this.driver.quit();
    }
}
