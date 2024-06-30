package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class FormPage extends BasePage{

    public FormPage(WebDriver navegador){
        super(navegador);
    }

    public FormPage Username(String user){
        // Preencher campo Name
        navegador.findElement(By.id("username")).sendKeys(user);
        return this;
    }
    
    public FormPage Password(String password){
        // Preencher campo e-mail
        navegador.findElement(By.id("password")).sendKeys(password);
        return this;
    }
        
    public LoggedPage Logged(){
        // Clicar no botão
        navegador.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click();
        return new LoggedPage(navegador);
    }
}
