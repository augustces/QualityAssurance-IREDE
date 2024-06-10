import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUpTest{
    @Test
    public void chromeTest(){
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/login");

        // Selecionar formulário
        WebElement signUpForm = navegador.findElement(By.className("signup-form"));

        // Preencher campo Name
        signUpForm.findElement(By.name("name")).sendKeys("Carolas");

        // Preencher campo e-mail
        signUpForm.findElement(By.name("email")).sendKeys("carolas@gmail.com");

        // Clicar no botão Sign Up
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

        // Saindo do navegador
        navegador.quit();
    }
}