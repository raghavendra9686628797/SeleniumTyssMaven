package org.automation.element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualGiftCardPage {
	@FindBy(id = "add-to-wishlist-button-78")
	private WebElement addToWishlist;
	@FindBy(xpath = "//input[@value='Email a friend'] ")
	private WebElement EmailaFriend;
	@FindBy(xpath = "//input[@value='Add to compare list'] ")
	private WebElement AddToCompareList;

	public VirtualGiftCardPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getAddToWishlist() {
		return addToWishlist;
	}

	public WebElement getEmailaFriend() {
		return EmailaFriend;
	}

	public WebElement getAddToCompareList() {
		return AddToCompareList;
	}
}
