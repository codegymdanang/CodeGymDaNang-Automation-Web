package javaautomationcidemo.thucydides.cucumber.steps;

import cucumber.api.java.en.Given;
import javaautomationcidemo.thucydides.cucumber.steps.serenity.UserSteps;
import net.thucydides.core.annotations.Steps;

public class HomeScenarioSteps {

	@Steps
	UserSteps userStep;
	
	@Given("^I want to buy a wool scarf$")
	public void openTheHomePage() {
		userStep.openTheHomePage();
	}
}
