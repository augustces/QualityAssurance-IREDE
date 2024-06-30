import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PreCadastro;
import suport.Web;

public class CadastroTest {
    private WebDriver navegador;

    @BeforeTest
    public void setUp(){
        navegador = Web.createDriver();
    }

    @Test
    public void cadastro(){
        new PreCadastro(navegador)
        .Login("exemplo1")
        .Email("exemplo3@gmail.com")
        .BotaoLogin()
        .Genero("id_gender2")
        .Password("12345678")
        .Dia("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[20]") // xpath
        .Mes("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select/option[10]") // xpath
        .Ano("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select/option[21]") // xpath
        .Newsletter()
        .Optin()
        .Nome("exemplo")
        .Sobrenome("qa")
        .Company("irede")
        .Address1("rua c")
        .Address2("rua a")
        .Country("/html/body/section/div/div/div/div[1]/form/p[6]/select/option[2]") // xpath
        .State("ceara")
        .City("fortal")
        .ZipCode("123456")
        .Number("0000000")
        .Cadastrar();
    }

    @AfterTest
    public void tearDown(){
        navegador.quit();
    }


}
