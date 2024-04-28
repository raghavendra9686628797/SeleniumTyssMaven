package org.automation.element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(linkText = "Register")
	private WebElement register;

	@FindBy(className = "ico-login")
	private WebElement login;
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement logout;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcart;

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlist;

	@FindBy(id = "small-searchterms")
	private WebElement searchtextfield;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement searchbtn;

	@FindBy(xpath = "//ul[@class=\"top-menu\"]//a[contains(text(),'Books')]")
	private WebElement books;

	@FindBy(xpath = "//ul[@class=\"top-menu\"]//a[contains(text(),'Computers')]")
	private WebElement computers;

	@FindBy(xpath = "//ul[@class=\"top-menu\"]//a[contains(text(),'Electronics')]")
	private WebElement electronics;

	@FindBy(xpath = "//ul[@class=\"top-menu\"]//a[contains(text(),'Apparel')]")
	private WebElement apparel_and_shoes;

	@FindBy(xpath = "//ul[@class=\"top-menu\"]//a[contains(text(),'Digital ')]")
	private WebElement digitalDownloads;

	@FindBy(xpath = "//ul[@class=\"top-menu\"]//a[contains(text(),'Jewelry')]")
	private WebElement jewelry;

	@FindBy(xpath = "//ul[@class=\"top-menu\"]//a[contains(text(),'Gift')]")
	private WebElement giftcards;

	@FindBy(xpath = "//a[text()='Compare products list']")
	private WebElement compareList;

	public Homepage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getSearchtextfield() {
		return searchtextfield;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getBooks() {
		return books;
	}

	public WebElement getComputers() {
		return computers;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getApparel_and_shoes() {
		return apparel_and_shoes;
	}

	public WebElement getDigitalDownloads() {
		return digitalDownloads;
	}

	public WebElement getJewelry() {
		return jewelry;
	}

	public WebElement getGiftcards() {
		return giftcards;
	}

	public WebElement CompareList() {
		return compareList;
	}

}
