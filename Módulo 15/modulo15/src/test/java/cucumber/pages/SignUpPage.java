package cucumber.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPage extends BasePage{

    public SignUpPage(){
        this.driver = new ChromeDriver();
        this.driver.get("https://automationexercise.com/");
        this.driver.manage().timeouts()
        .implicitlyWait(Duration.ofSeconds(2))
        .pageLoadTimeout(Duration.ofSeconds(10));
    }

    public void clicarXpath(String xpath){
        this.driver.findElement(By.xpath(xpath)).click();
    }

    public void preencherCampos(String xpath, String texto){
        this.driver.findElement(By.xpath(xpath)).sendKeys(texto);
    }

    public boolean verificaUrl(String url){
        return this.driver.getCurrentUrl().equals(url);
    }

    public boolean verificarTextoPorXpath(String xpath, String texto){
        return this.driver.findElement(By.xpath(xpath)).getText().equals(texto);
    }

}