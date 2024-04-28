package org.automation.test_script;

import org.automation.element_Repository.DigitalDownloadPage;
import org.automation.element_Repository.ShoppingCart;
import org.automation.generic_library.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DigitalDownloadsTest extends BaseTest {
	@Test
	public void Verify_User_Is_Able_To_Add_Product_To_cart() throws InterruptedException {
		// click on digital downloads
		h.getDigitalDownloads().click();

		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Digital downloads", "digital downloadpage not displayed");
		Reporter.log("digitaldownload page displayed", true);

		DigitalDownloadPage dp = new DigitalDownloadPage(d);
		for (WebElement cart : dp.getAddtocart()) {
			cart.click();
			// Thread.sleep(3000);
		}
		// navigate to cart page
		h.getShoppingcart().click();

		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Shopping Cart", "shopping cart page not displayed");
		Reporter.log("shopping cart page displayed", true);

		ShoppingCart s = new ShoppingCart(d);

		// click on check box
		for (WebElement box : s.getCheckbox()) {
			box.click();
			Thread.sleep(3000);
		}

		// click on update cart

		s.getUpdatecart().click();
	}
}
