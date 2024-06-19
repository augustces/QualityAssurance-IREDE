import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExercicioTest {
     
    private WebDriver navegador;

    @BeforeTest
    public void setUp(){
        // Cria instância para acessar o navegador no site informado
        navegador = new ChromeDriver();
        navegador.get("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void exercicio(){

        // Preencher campo Name
        navegador.findElement(By.id("username")).sendKeys("tomsmith");

        // Preencher campo e-mail
        navegador.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        // Clicar no botão Sign Up
        navegador.findElement(By.xpath("/html/body/div[2]/div/div/form/button")).click();

        String fullpage = navegador.getPageSource();
        String str = "You logged into a secure area!";
        Assert.assertTrue(fullpage.contains(str));
        
    }

    @AfterTest
    public void tearDown(){
        // Saindo do navegador
        navegador.quit();   
    }
}
