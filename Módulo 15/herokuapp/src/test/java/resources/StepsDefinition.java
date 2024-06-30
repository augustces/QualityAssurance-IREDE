package resources;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class StepsDefinition {
    private LoginPage login;
    
    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        login = new LoginPage();
    }

    @When("User enters tomsmith on username field")
    public void user_enters_tomsmith_on_username_field() {
        login.preencherCampos("/html/body/div[2]/div/div/form/div[1]/div/input", "tomsmith");
    }
    @When("User enters SuperSecretPassword! on password field")
    public void user_enters_super_secret_password_on_password_field() {
        login.preencherCampos("/html/body/div[2]/div/div/form/div[2]/div/input", "SuperSecretPassword!");
        login.clicarXpath("/html/body/div[2]/div/div/form/button");
    }
    @Then("User should be logged")
    public void user_should_be_logged() {
        boolean logged = login.verificarTextoPorXpath("/html/body/div[1]/div/div", "You logged into a secure area!");
        if (logged)
            login.fechar();
    }


    @When("User enters a password on password field")
    public void user_enters_a_password_on_password_field() {
        login.preencherCampos("/html/body/div[2]/div/div/form/div[2]/div/input", "12345678");
        login.clicarXpath("/html/body/div[2]/div/div/form/button");
    }

    @Then("User should get a password error message")
    public void user_should_get_an_password_error_message() {
    boolean invalid = login.verificarTextoPorXpath("/html/body/div[1]/div/div", "Your password is invalid!");
    if (invalid)
        login.fechar();
    }

    @When("User enters an username on username field")
    public void user_enters_an_username_on_username_field() {
        login.preencherCampos("/html/body/div[2]/div/div/form/div[1]/div/input", "tomsmith");
        login.clicarXpath("/html/body/div[2]/div/div/form/button");
    }

    @Then("User should get an username error message")
    public void user_should_get_an_username_error_message() {
    boolean invalid = login.verificarTextoPorXpath("/html/body/div[1]/div/div", "Your username is invalid!");
    if (invalid)
        login.fechar();
}
     
}