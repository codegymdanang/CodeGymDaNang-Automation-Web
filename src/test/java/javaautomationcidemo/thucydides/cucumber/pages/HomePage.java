package javaautomationcidemo.thucydides.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://128.199.118.34:8080/java-demo-ci-web/")
public class HomePage extends PageObject {

	@FindBy(id = "email")
	WebElementFacade emailText;
	@FindBy(className ="btn")
	WebElementFacade userNamebutton;
	@FindBy(id ="result")
	WebElementFacade resultTxt;
	
	
	public void enterEmail() {
		emailText.typeAndEnter("levunguyen@gmail.com");
	}
	
	public void clickGetUserNameButton() {
		userNamebutton.click();
	}
	
	public String getResult() {
		return resultTxt.getText();
	}
}
