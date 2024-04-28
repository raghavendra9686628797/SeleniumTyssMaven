package org.automation.test_script;

import org.automation.element_Repository.BooksPage;
import org.automation.element_Repository.ComparelistPage;
import org.automation.element_Repository.FictionEx_Page;
import org.automation.generic_library.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Books03Test extends BaseTest {
	@Test
	public void Verify_User_Is_able_To_Remove_Product_Compare_ProductList() {
		// click on books link
		h.getBooks().click();

		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Books", "books page not displayed");
		Reporter.log("books page displayed", true);
		// click on fiction ex link
		BooksPage b = new BooksPage(d);
		b.getFictionEx_link().click();

		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Fiction EX", "fiction ex page not displayed");
		Reporter.log("Fictionexpage displayed", true);
		// click on comparelist button
		FictionEx_Page fp = new FictionEx_Page(d);
		fp.getAddToCompareList().click();

		// click on books link

//		h.getBooks().click();
//		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Books","books page not displayed");
//		Reporter.log("books page displayed",true);
//		//click on fictionlink
//		b.getFictionLink().click();
//		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Fiction","fiction page is not displayed");
//		Reporter.log("fiction page is displayed",true);
//		//click on comparelist
//		FictionPage f=new FictionPage(d);
//		f.getAddToCompareList().click();
		// remove from comparelist
		ComparelistPage c = new ComparelistPage(d);
		for (WebElement remove : c.getRemove()) {
			remove.click();
		}
//	UtilityMethods um=new UtilityMethods();
//	//scroll to comparelist element
//	um.Scroll(d, h.CompareList());
//	//click on compare list
//	h.CompareList().click();
	}
}
