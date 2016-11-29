package javaautomationcidemo.thucydides.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;

public class HomeScenarioSteps {

	@Steps
	UserSteps userStep;
	
	@Given("^I am on the web page$")
	public void openTheHomePage() {
		userStep.openTheHomePage();
	}
	
	@When("^I enter my email$")
	public void enterEmail() {
		userStep.enterEmail();
	}
	
	@When("^I click get username button$")
	public void clickGetUserNameButton() {
		userStep.clickGetUserNameButton();
	}
	
	@Then("^I should see the username$")
	public void shoudSeeTheUserName() {
		userStep.shoudSeeTheUserName();
	}
}
