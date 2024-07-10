package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void Email(String email){
        // Preencher campo Email
        driver.findElement(By.id("username-input")).sendKeys(email);
    }
    
    // Aperta botão e verifica a mensagem de erro
    public void Try2Login(){
        // Clicar no botão
        driver.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[2]/button")).click();
    }

    public boolean ErrorMessage(String message){
        String str = driver.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[1]/div[2]/div[2]/div/small")).getText();
        return message.equals(str);
    }
}
