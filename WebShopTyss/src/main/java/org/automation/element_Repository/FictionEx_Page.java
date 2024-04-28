package org.automation.element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionEx_Page {
	@FindBy(xpath = "//h1[contains(text(),'Fiction')]")
	private WebElement fictioExtitle;
	@FindBy(id = "add-to-wishlist-button-78")
	private WebElement addToWishlist;
	@FindBy(xpath = "//input[@value='Email a friend'] ")
	private WebElement EmailaFriend;
	@FindBy(xpath = "//input[@value='Add to compare list'] ")
	private WebElement AddToCompareList;

	public FictionEx_Page(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getFictioExtitle() {
		return fictioExtitle;
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
