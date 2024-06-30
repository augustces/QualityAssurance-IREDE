package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreCadastro extends BasePage {

    public PreCadastro(WebDriver navegador){
        // Chama o construtor pai para inicializar o objeto
        super(navegador);
    }

    // Envia o login no campo de Nome
    public PreCadastro Login(String login){
        navegador.findElement(By.className("signup-form")).findElement(By.name("name")).sendKeys(login);
        return this;
    }

    // Envia o email no campo de Email
    public PreCadastro Email(String email){
        navegador.findElement(By.className("signup-form")).findElement(By.name("email")).sendKeys(email);
        return this;
    }
    // Clica no botão e vai para outro página
    public Cadastro BotaoLogin(){
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
        return new Cadastro(navegador);
    }
}