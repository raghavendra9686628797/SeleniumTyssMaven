package org.automation.element_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {

	@FindBy(xpath = "//h1[text()='Books']")
	private WebElement bookTitle;

	@FindBy(id = "products-orderby")
	private WebElement sortbyDropDDown;

	@FindBy(id = "products-pagesize")
	private WebElement displayDropDDown;

	@FindBy(id = "products-viewmode")
	private WebElement viewasDropDDown;
	@FindBy(xpath = "//a[text()='Fiction']")
	private WebElement fictionLink;

	@FindBy(xpath = "//a[text()='Fiction EX']")
	private WebElement FictionEx_link;

	public BooksPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public WebElement getBookTitle() {
		return bookTitle;
	}

	public WebElement getSortbyDropDDown() {
		return sortbyDropDDown;
	}

	public WebElement getDisplayDropDDown() {
		return displayDropDDown;
	}

	public WebElement getFictionLink() {
		return fictionLink;
	}

	public WebElement getFictionEx_link() {
		return FictionEx_link;
	}

	public WebElement getViewasDropDDown() {
		return viewasDropDDown;
	}
}
