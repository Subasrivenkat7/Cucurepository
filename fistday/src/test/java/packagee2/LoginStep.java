package packagee2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStep {
	@Given("user enter {string}")
	public void user_enters(String string) {
	   System.out.println(string);
	}

	@When("user password {string}")
	public void user_password(String string) {
		 System.out.println(string);
	}

	@And("click login")
	public void click_login() {
		System.out.println("success");
	   
	}

}
