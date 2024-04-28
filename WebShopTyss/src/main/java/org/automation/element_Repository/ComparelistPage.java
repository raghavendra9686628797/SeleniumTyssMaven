package org.automation.element_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparelistPage {

	@FindBy(xpath = "//div[@class='page-body']//input[@value='Remove']")
	private List<WebElement> remove;

	public ComparelistPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public List<WebElement> getRemove() {
		return remove;
	}
}
