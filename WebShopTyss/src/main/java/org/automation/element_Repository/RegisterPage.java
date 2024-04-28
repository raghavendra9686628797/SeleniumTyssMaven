package org.automation.element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(id = "gender-male")
	private WebElement gender;
	@FindBy(id = "FirstName")
	private WebElement first_name;
	@FindBy(id = "LastName")
	private WebElement Last_name;
	@FindBy(id = "Email")
	private WebElement email;
	@FindBy(id = "Password")
	private WebElement password;
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPassword;
	@FindBy(id = "register-button")
	private WebElement registerbtn;

	public RegisterPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return Last_name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getRegisterbtn() {
		return registerbtn;
	}

}
