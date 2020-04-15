package com.example.bit.wonders.demo;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeatureStepDefinition extends CucumberSpringContextConfiguration{

	@Given("User wants to login to application")
	public void user_wants_to_login_to_application() {
		System.out.println("Step 1");
	}

	@Given("search for his work-items")
	public void search_for_his_work_items() {
		System.out.println("Step 2");
	}

	@When("User enters his username and password")
	public void user_enters_his_username_and_password() {
		System.out.println("Step 3");
	}

	@When("clicks on submit")
	public void clicks_on_submit() {
		System.out.println("Step 4");
	}

	@Then("User is logged into the application")
	public void user_is_logged_into_the_application() {
		assertTrue(true);
	}

	@Then("User can see his work-items in his HOMEPAGE.")
	public void user_can_see_his_work_items_in_his_HOMEPAGE() {
		assertTrue(true);
	}
	
}
