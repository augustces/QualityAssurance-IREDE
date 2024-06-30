package cucumber.resources;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import cucumber.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinition {
    private SignUpPage signUp;
    private Random rand;

    @Given("User is on Homepage")
    public void user_is_on_homepage() {
        signUp = new SignUpPage();
    }
    @Given("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        signUp.clicarXpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");
    }
    @When("User enters a name on name field")
    public void user_enters_a_name_on_name_field() {
        signUp.preencherCampos("/html/body/section/div/div/div[3]/div/form/input[2]", "cursoQA");
    }
    @When("User enters an email on email field")
    public void user_enters_an_email_on_email_field() {
        rand = new Random();
        int randNum = rand.nextInt(10000)+1;
        signUp.preencherCampos("/html/body/section/div/div/div[3]/div/form/input[3]", "email" + randNum + "@exemplo.com");
        signUp.clicarXpath("/html/body/section/div/div/div[3]/div/form/button");
        System.out.println(randNum);
    }
    @Then("User should be redirectioned to Sign Up Page")
    public void user_should_be_redirectioned_to_sign_up_page() {
        boolean assert1 = signUp.verificarTextoPorXpath("/html/body/section/div/div/div/div[1]/h2/b", "Enter Account Information");
        assertTrue(assert1);

    }

    @When("User enters an exiting email on email field")
    public void user_enters_an_exiting_email_on_email_field() {
        signUp.preencherCampos("/html/body/section/div/div/div[3]/div/form/input[3]", "teste@email.com");
        signUp.clicarXpath("/html/body/section/div/div/div[3]/div/form/button");
    }
    @Then("User should get an error message")
    public void user_should_get_an_error_message() {
        boolean assert1 = signUp.verificarTextoPorXpath("/html/body/section/div/div/div[3]/div/form/p", "Email Address already exist!");
        assertTrue(assert1);

    }
}
