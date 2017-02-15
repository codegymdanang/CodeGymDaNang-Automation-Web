package javaautomationcidemo.thucydides.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/java-demo-ci-web/")
public class HomePage extends PageObject {

	@FindBy(id = "phone")
	WebElementFacade phoneNumber;
	
	@FindBy(id = "f")
	WebElementFacade fullName;
	
	@FindBy(id = "email")
	WebElementFacade emailText;
	
	@FindBy(id = "username")
	WebElementFacade userName;
	
	@FindBy(id = "password")
	WebElementFacade password;
	
	@FindBy(id = "repassword")
	WebElementFacade rePassword;
	
	@FindBy(id = "agree")
	WebElementFacade agreeBnt;
	
	@FindBy(id = "register")
	WebElementFacade register;
	
	
	
	
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

	public void enterPhoneNumber() {
		phoneNumber.typeAndEnter("0905509951");
		
	}

	public void enterFullName() {
		fullName.typeAndEnter("Le Vu Nguyen");
		
	}

	public void enterUserName() {
		userName.type("levunguyen");
		
	}

	public void enterPassword() {
		password.type("123456789");
		
	}

	public void enterReEnterPassword() {
		rePassword.type("123456789");
		
	}

	public void clickAgreeButton() {
		agreeBnt.click();
	}

	public void clickRegistration() {
		
		register.click();
	}
}
