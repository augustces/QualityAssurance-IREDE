package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage (WebDriver driver){
        super(driver);
    }

    public void go2LoginPage(){
        driver.findElement(By.xpath("/html/body/div[1]/main/nav/div/section[2]/div/ul[1]/li/button")).click();
    }
}
