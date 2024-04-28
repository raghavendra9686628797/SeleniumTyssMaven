package org.automation.element_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadPage {
	@FindBy(xpath = "//h1[text()='Digital downloads']")
	private WebElement digitalDownloadTitle;
	@FindBy(id = "products-orderby")
	private WebElement sortbyDropDDown;

	@FindBy(id = "products-pagesize")
	private WebElement displayDropDDown;

	@FindBy(id = "products-viewmode")
	private WebElement viewasDropDDown;
	@FindBy(xpath = "//div[@class='product-grid']//input[@value=\"Add to cart\"]")
	private List<WebElement> addtocart;

	public DigitalDownloadPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getDigitalDownloadTitle() {
		return digitalDownloadTitle;
	}

	public WebElement getSortbyDropDDown() {
		return sortbyDropDDown;
	}

	public WebElement getDisplayDropDDown() {
		return displayDropDDown;
	}

	public WebElement getViewasDropDDown() {
		return viewasDropDDown;
	}

	public List<WebElement> getAddtocart() {
		return addtocart;
	}

}
