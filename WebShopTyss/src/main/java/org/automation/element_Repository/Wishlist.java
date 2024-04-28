package org.automation.element_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {

	@FindBy(xpath = "//div[@class='page wishlist-page']//input[@name='removefromcart']")
	private List<WebElement> removewishlistcheckBox;

	@FindBy(name = "updatecart")
	private WebElement updatewishlist;

	@FindBy(name = "addtocartbutton")
	private WebElement wishlist_addtocart;

	@FindBy(xpath = "//input[@value='Email a friend']")
	private WebElement wishlist_emailafriend;

	public Wishlist(WebDriver d) {
		PageFactory.initElements(d, this);

	}

	public List<WebElement> getRemovewishlistcheckBox() {
		return removewishlistcheckBox;
	}

	public WebElement getUpdatewishlist() {
		return updatewishlist;
	}

	public WebElement getWishlist_addtocart() {
		return wishlist_addtocart;
	}

	public WebElement getWishlist_emailafriend() {
		return wishlist_emailafriend;
	}
}
