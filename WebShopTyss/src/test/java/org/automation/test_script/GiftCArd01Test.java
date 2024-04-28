package org.automation.test_script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.automation.element_Repository.EmailAFriend_page;
import org.automation.element_Repository.GiftcardsPage;
import org.automation.element_Repository.VirtualGiftCardPage;
import org.automation.generic_library.BaseTest;
import org.automation.generic_library.DataUtility;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GiftCArd01Test extends BaseTest {
	@Test
	public void Verify_User_Is_able_To_Email_a_Friend_Gift_card() throws EncryptedDocumentException, IOException {
		// click on gift card link
		h.getGiftcards().click();
		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Gift Cards", "giftcards page not displayed");
		Reporter.log("gift cards page displayed", true);
		// click on virtual gift
		GiftcardsPage v = new GiftcardsPage(d);
		v.getVirtualGiftCard().click();

		Assert.assertEquals(d.getTitle(), "Demo Web Shop. $5 Virtual Gift Card",
				"virtual gift card page not displayed");
		Reporter.log("virtualgift page displayed", true);

		// click on email a friend
		VirtualGiftCardPage vg = new VirtualGiftCardPage(d);
		vg.getEmailaFriend().click();

		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Email A Friend. $5 Virtual Gift Card",
				"email a friend page not displayed");
		Reporter.log("email afriend page is displayed", true);

		DataUtility du = new DataUtility();

		// email a friend
		EmailAFriend_page ef = new EmailAFriend_page(d);
		ef.getFriendsEmailtextfield().sendKeys(du.excell_data("RegisterDetailes", 2, 2));
		ef.getYouremailtextfield().sendKeys(du.excell_data("RegisterDetailes", 1, 2));
		ef.getSendmailbtn().click();

	}
}
