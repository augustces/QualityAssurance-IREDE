import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUpAutomaticoTest {
    private WebDriver navegador;
    private Random rand = new Random();
    private int value = rand.nextInt(10000)+1;

    @BeforeTest
    public void setUp(){
        // Cria instância para acessar o navegador no site informado
        navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/login");
    }

    @Test
    public void automacao(){
        // Selecionar formulário
        WebElement signUpForm = navegador.findElement(By.className("signup-form"));

        // Preencher campo Name
        signUpForm.findElement(By.name("name")).sendKeys("CursoQA");

        // Preencher campo e-mail
        signUpForm.findElement(By.name("email")).sendKeys("usuario" + value + "@example.com");

        // Clicar no botão Sign Up
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

    }

    @AfterTest
    public void tearDown(){
        navegador.quit();
    }
}
