package common;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class LoginAuthentication extends BaseTest {

    public LoginAuthentication() throws Exception {
        super();
    }

    @Given("^I launch (.*) the Application$")
    public void launch(String DB) throws Exception {
        BaseTest.setUp(DB);
    }

    @When("^I enter the Credentials$")
    public void iEnterTheCredentials() throws InterruptedException {
        BaseTest.login();
    }
}
