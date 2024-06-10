import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CadastroTest {
    private WebDriver navegador;

    @BeforeTest
    public void setUp(){
        // Cria instância para acessar o navegador no site informado
        navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/login");
    }

    //Sign Up
    @Test
    public void chromeTest(){
        // Selecionar formulário
        WebElement signUpForm = navegador.findElement(By.className("signup-form"));

        // Preencher campo Name
        signUpForm.findElement(By.name("name")).sendKeys("Carol");

        // Preencher campo e-mail
        signUpForm.findElement(By.name("email")).sendKeys("carolandrade@gmail.com");

        // Clicar no botão Sign Up
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

        // Cadastro
        // Selecionar formulário
        WebElement loginForm = navegador.findElement(By.id("form"));
        // Selecionar gênero
        loginForm.findElement(By.id("id_gender2")).click();
        // Preencher nome e email já foi com o teste anterior
        // Preencher senha
        loginForm.findElement(By.id("password")).sendKeys("12345678");

        // Preencher data de nascimento
        // dia
        loginForm.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[20]")).click();
        // mês
        loginForm.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select/option[10]")).click();
        // ano
        loginForm.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select/option[21]")).click();
        //checkbox1
        loginForm.findElement(By.id("newsletter")).click();
        // checkbox2
        loginForm.findElement(By.id("optin")).click();
        // Preencher nome
        loginForm.findElement(By.id("first_name")).sendKeys("Carol");
        // Preencher sobrenome
        loginForm.findElement(By.id("last_name")).sendKeys("Andrade");
        // Preencher Company
        loginForm.findElement(By.id("company")).sendKeys("IT TALENT");
        // Preencher Address 1
        loginForm.findElement(By.id("address1")).sendKeys("Mystic Falls, 34, Virginia");
        // Preencher Address 2
        loginForm.findElement(By.id("address2")).sendKeys("Street C, 764, Texas");
        // Preencher Country
        loginForm.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[6]/select/option[2]"));
        // Preencher State
        loginForm.findElement(By.id("state")).sendKeys("Virginia");
        // Preencher City
        loginForm.findElement(By.id("city")).sendKeys("Mystic Falls");
        // Preencher ZipCode
        loginForm.findElement(By.id("zipcode")).sendKeys("123456");
        // Preencher Mobile Number
        loginForm.findElement(By.id("mobile_number")).sendKeys("123456789");
        // Clicar no botão cadastrar
        navegador.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();

    }

    @AfterTest
    public void tearDown(){
        // Saindo do navegador
        navegador.quit();
    }
    
}
