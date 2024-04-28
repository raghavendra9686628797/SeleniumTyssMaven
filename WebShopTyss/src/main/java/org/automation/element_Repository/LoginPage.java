package org.automation.element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "Email")
	private WebElement emailtextfield;
	@FindBy(className = "password")
	private WebElement passwordtextfield;
	@FindBy(xpath = "//input[@value=\"Log in\"]")
	private WebElement loginbtn;

	public LoginPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
