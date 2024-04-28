package org.automation.element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionPage {

	@FindBy(xpath = "//input[@value='Email a friend'] ")
	private WebElement EmailaFriend;
	@FindBy(xpath = "//input[@value='Add to compare list'] ")
	private WebElement AddToCompareList;

	public FictionPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getEmailaFriend() {
		return EmailaFriend;
	}

	public WebElement getAddToCompareList() {
		return AddToCompareList;
	}

}
