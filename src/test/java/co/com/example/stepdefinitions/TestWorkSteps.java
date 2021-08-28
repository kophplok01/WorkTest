package co.com.example.stepdefinitions;

import co.com.example.tasks.SignInTask;
import co.com.example.userinterfaces.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.remote.server.handler.GoBack;

import static co.com.example.userinterfaces.SignInPage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class TestWorkSteps {

    private SignInPage homePage = new SignInPage();

    @Given("^the actor (.*) accesses to the github login page$")
    public void the_actor_accesses_to_the_github_login_page(String nActor) {
        theActorCalled(nActor).wasAbleTo(Open.browserOn(homePage));
        getDriver().manage().window().maximize();

    }


    @When("^the actor clicks on terms button he can see the terms and services page$")
    public void the_actor_clicks_on_terms_button_he_can_see_the_terms_and_services_page() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(terms_button),
                Ensure.thatTheCurrentPage().currentUrl().isEqualTo("https://docs.github.com/en/github/site-policy/github-terms-of-service"),
                Open.url("https://github.com/login")
        );

    }

    @When("^when the actor clicks on the privacy button he can see the privacy statement page$")
    public void when_the_actor_clicks_on_the_privacy_button_he_can_see_the_privacy_statement_page() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(privacy_button),
                Ensure.thatTheCurrentPage().currentUrl().isEqualTo("https://docs.github.com/en/github/site-policy/github-privacy-statement"),
                Open.url("https://github.com/login")
        );
    }

    @When("^when the actor clicks on the Security button he can see the indicated page$")
    public void when_the_actor_clicks_on_the_Security_button_he_can_see_the_indicated_page() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(security_button),
                Ensure.thatTheCurrentPage().currentUrl().isEqualTo("https://github.com/security"),
                Open.url("https://github.com/login")
        );
    }

    @When("^when the actor clicks on the contact button he can see the indicated page$")
    public void when_the_actor_clicks_on_the_contact_button_he_can_see_the_indicated_page() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(Contact_button),
                Ensure.thatTheCurrentPage().currentUrl().isEqualTo("https://support.github.com/request"),
                Open.url("https://github.com/login")
        );
    }

    @When("^when the actor clicks on the button to create a new account, he can see the indicated page$")
    public void when_the_actor_clicks_on_the_button_to_create_a_new_account_he_can_see_the_indicated_page() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(new_account_button),
                Ensure.thatTheCurrentPage().currentUrl().isEqualTo("https://github.com/signup?source=login"),
                Open.url("https://github.com/login")
        );
    }

    @When("^when the actor clicks on the forgot password button, he can see the indicated page$")
    public void when_the_actor_clicks_on_the_forgot_password_button_he_can_see_the_indicated_page() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(Forgot_password_button),
                Ensure.thatTheCurrentPage().currentUrl().isEqualTo("https://github.com/password_reset"),
                Open.url("https://github.com/login")
        );
    }

    @Then("^the actor verifies that he can log in complying with the specified conditions: user (.*) and password (.*)$")
    public void the_actor_verifies_that_he_can_log_in_complying_with_the_specified_conditions_user_and_password(String user, String password) {
        theActorInTheSpotlight().wasAbleTo(

                SignInTask.whitUserAndPassword(user, password)

        );

    }


}
