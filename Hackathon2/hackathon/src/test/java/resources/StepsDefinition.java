package resources;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class StepsDefinition{
    private WebDriver driver;
    private Random rand;
    private HomePage home;
    private LoginPage login;
    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://homero.app.br/");
        home = new HomePage(driver);
        home.go2LoginPage();
        login = new LoginPage(driver);
    }
    @When("User enters a email on email field")
    public void user_enters_a_email_on_email_field() {
        rand = new Random();
        int randNum = rand.nextInt(10000)+1;
        login.Email("exemplo" + randNum + "@exemplo.com");
        login.Try2Login();
        
    }
    @Then("User should get an error message")
    public void user_should_get_an_error_message() {
        Assert.assertTrue(login.ErrorMessage("Esse campo é obrigatório"));
        driver.quit();
    }
}