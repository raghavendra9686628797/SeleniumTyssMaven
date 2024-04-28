package org.automation.test_script;

import org.automation.element_Repository.BooksPage;
import org.automation.element_Repository.FictionEx_Page;
import org.automation.element_Repository.Wishlist;
import org.automation.generic_library.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Book01Test extends BaseTest {
	@Test
	public void Verify_User_Is_Able_To_Add_Product_To_Wishlist() {
		// click on books link
		h.getBooks().click();

		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Books", "books page not displayed");
		Reporter.log("books page displayed", true);
		// click on fiction ex link
		BooksPage b = new BooksPage(d);
		b.getFictionEx_link().click();

		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Fiction EX", "fiction ex page not displayed");
		Reporter.log("Fictionexpage displayed", true);

		// click on wishlist button
		FictionEx_Page fp = new FictionEx_Page(d);
		fp.getAddToWishlist().click();

		// navigate to wishlist page
		h.getWishlist().click();

		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Wishlist", "wishlist page is not displayed");
		Reporter.log("wishlist page displayed", true);

		// remove from wishlist

		Wishlist w = new Wishlist(d);
		for (WebElement checkbox : w.getRemovewishlistcheckBox()) {
			checkbox.click();
		}
		w.getUpdatewishlist().click();

	}
}
