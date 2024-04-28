package org.automation.element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftcardsPage {
	@FindBy(xpath = "//a[text()='$5 Virtual Gift Card']")
	private WebElement VirtualGiftCard;

	public GiftcardsPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getVirtualGiftCard() {
		return VirtualGiftCard;
	}

}
