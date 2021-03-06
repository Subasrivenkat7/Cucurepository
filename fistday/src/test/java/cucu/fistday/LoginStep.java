package cucu.fistday;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	@Given("Users enters username")
	public void users_enters_username() {
	    System.out.println("user entering name");
	}

	@When("User enter password")
	public void user_enter_password() {
	  System.out.println("password is entered");
	}

	@And("click on login button")
	public void click_on_login_button() {
	    System.out.println("clicked on login");
	}

	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
		 System.out.println("user is on homepage");
	}

}
