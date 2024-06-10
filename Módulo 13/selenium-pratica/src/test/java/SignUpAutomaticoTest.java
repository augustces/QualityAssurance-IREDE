import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.example.User;

public class SignUpAutomaticoTest {
    private WebDriver navegador;
    private List<User> users = new ArrayList<>();

    @Test
    public void automacao(){
        
        // Lista de usuários para teste
        users.add(new User("usuario1@example.com", "Usuario um"));
        users.add(new User("usuario2@example.com", "Usuario dois"));
        users.add(new User("usuario3@example.com", "Usuario três"));

        for (User user : users) {
        // Cria instância para acessar o navegador no site informado
        navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/login");
        // Selecionar formulário
        WebElement signUpForm = navegador.findElement(By.className("signup-form"));

        // Preencher campo Name
        signUpForm.findElement(By.name("name")).sendKeys(user.getName());

        // Preencher campo e-mail
        signUpForm.findElement(By.name("email")).sendKeys(user.getEmail());

        // Clicar no botão Sign Up
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

        navegador.quit();
        }
    }
}
