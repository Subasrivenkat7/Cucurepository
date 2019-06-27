package package4;


import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreationStep {
	@Given("I want to create account")
	public void i_want_to_create_account() {
		System.out.println("creating");
	   
	}

	@When("user enter details")
	public void user_enter_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> List= dataTable.asMaps(String.class,String.class);
		for(int i=0;i<=List.size();i++)
		{
			System.out.println(List.get(i).get("name"));
			System.out.println(List.get(i).get("value"));
			
		}
		
	   
	}

	@Then("enter the submit button")
	public void enter_the_submit_button() {
	    
	}
}
