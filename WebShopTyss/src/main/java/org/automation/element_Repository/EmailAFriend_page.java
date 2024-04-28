package org.automation.element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailAFriend_page {
	@FindBy(id = "FriendEmail")
	private WebElement friendsEmailtextfield;
	@FindBy(id = "YourEmailAddress")
	private WebElement youremailtextfield;
	@FindBy(name = "send-email")
	private WebElement sendmailbtn;

	public EmailAFriend_page(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getFriendsEmailtextfield() {
		return friendsEmailtextfield;
	}

	public WebElement getYouremailtextfield() {
		return youremailtextfield;
	}

	public WebElement getSendmailbtn() {
		return sendmailbtn;
	}

}
