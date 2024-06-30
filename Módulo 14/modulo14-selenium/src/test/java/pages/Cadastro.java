package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cadastro extends BasePage {
    public Cadastro(WebDriver navegador){
        super(navegador);
    }

    public Cadastro Genero(String genero) {
        // Selecionar gênero
        navegador.findElement(By.id(genero)).click();
        return this;

    }

    public Cadastro Password(String password) {
        // Preencher nome e email já foi com o teste anterior
        // Preencher senha
        navegador.findElement(By.id("password")).sendKeys(password);
        return this;

    }
    // Preencher data de nascimento
    public Cadastro Dia(String dia) {
        
        // dia
        navegador.findElement(By.xpath(dia)).click();
        return this;
    }

    public Cadastro Mes(String mes) {
        // mês
        navegador.findElement(By.xpath(mes)).click();
        return this;
    }

    public Cadastro Ano(String ano) {
        // ano
        navegador.findElement(By.xpath(ano)).click();
        return this;

    }

    public Cadastro Newsletter() {
        //checkbox1
        navegador.findElement(By.id("newsletter")).click();        
        return this;

    }


    public Cadastro Optin() {
        // checkbox2
        navegador.findElement(By.id("optin")).click();

        return this;

    }

    public Cadastro Nome(String nome) {
        // Preencher nome
        navegador.findElement(By.id("first_name")).sendKeys(nome);

        return this;

    }

    public Cadastro Sobrenome(String sobrenome) {
        // Preencher sobrenome
        navegador.findElement(By.id("last_name")).sendKeys(sobrenome);

        return this;

    }

    public Cadastro Company(String company) {
        // Preencher Company
        navegador.findElement(By.id("company")).sendKeys(company);

        return this;

    }

    public Cadastro Address1(String ad1) {
        // Preencher Address 1
        navegador.findElement(By.id("address1")).sendKeys(ad1);

        return this;

    }

    public Cadastro Address2(String ad2) {
        // Preencher Address 2
        navegador.findElement(By.id("address2")).sendKeys(ad2);
        return this;
    }

    public Cadastro Country(String country) {
        // Preencher Country
        navegador.findElement(By.xpath(country));

        return this;
    }

    public Cadastro State(String state) {
        // Preencher State
        navegador.findElement(By.id("state")).sendKeys(state);

        return this;
    }

    public Cadastro City(String city) {
        // Preencher City
        navegador.findElement(By.id("city")).sendKeys(city);

        return this;
    }

    public Cadastro ZipCode(String zipcode) {
        // Preencher ZipCode
        navegador.findElement(By.id("zipcode")).sendKeys(zipcode);

        return this;
    }

    public Cadastro Number(String number) {
        // Preencher Mobile Number
        navegador.findElement(By.id("mobile_number")).sendKeys(number);
        return this;
    }

    public ContaCriada Cadastrar() {
        // Clicar no botão cadastrar
        navegador.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();
        return new ContaCriada(navegador);
}   
        
}
