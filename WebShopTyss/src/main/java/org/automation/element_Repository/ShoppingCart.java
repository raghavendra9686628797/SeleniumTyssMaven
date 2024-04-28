package org.automation.element_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	@FindBy(xpath = "//td[@class=\"remove-from-cart\"]//input")
	private List<WebElement> checkbox;

	@FindBy(name = "updatecart")
	private WebElement updatecart;

	@FindBy(name = "continueshopping")
	private WebElement continueshopping;

	@FindBy(css = "[class='discount-coupon-code']")
	private WebElement coupencodetextfield;

	@FindBy(css = "[class='discount-coupon-code']")
	private WebElement applycoupenbtn;

	@FindBy(name = "giftcardcouponcode")
	private WebElement giftcardtextfield;

	@FindBy(css = "[value='Add gift card']")
	private WebElement addgiftcardbtn;

	@FindBy(id = "CountryId")
	private WebElement countryDropDown;

	@FindBy(name = "estimateshipping")
	private WebElement estimateshippingbtn;

	@FindBy(id = "termsofservice")
	private WebElement termsandconditionsChexkBox;

	@FindBy(id = "checkout")
	private WebElement checkoutbtn;

	public ShoppingCart(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public List<WebElement> getCheckbox() {
		return checkbox;
	}

	public WebElement getUpdatecart() {
		return updatecart;
	}

	public WebElement getContinueshopping() {
		return continueshopping;
	}

	public WebElement getCoupencodetextfield() {
		return coupencodetextfield;
	}

	public WebElement getApplycoupenbtn() {
		return applycoupenbtn;
	}

	public WebElement getGiftcardtextfield() {
		return giftcardtextfield;
	}

	public WebElement getAddgiftcardbtn() {
		return addgiftcardbtn;
	}

	public WebElement getCountryDropDown() {
		return countryDropDown;
	}

	public WebElement getEstimateshippingbtn() {
		return estimateshippingbtn;
	}

	public WebElement getTermsandconditionsChexkBox() {
		return termsandconditionsChexkBox;
	}

	public WebElement getCheckoutbtn() {
		return checkoutbtn;
	}

}
