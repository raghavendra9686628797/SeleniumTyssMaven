package org.automation.test_script;

import java.io.IOException;
import java.time.Duration;

import org.automation.element_Repository.Homepage;
import org.automation.element_Repository.RegisterPage;
import org.automation.generic_library.DataUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Register01Test {
	@Test
	public void Verify_User_Is_Able_To_Register() throws IOException, InterruptedException {
		DataUtility du = new DataUtility();
//launch browser
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//navigate to url
		d.get(du.property_data("url"));

		Assert.assertEquals(d.getTitle(), "Demo Web Shop", "webshop page not displayed");
		Reporter.log("webshop page is displayed", true);

		Homepage h = new Homepage(d);
//click on register button
		h.getRegister().click();

		Assert.assertEquals(d.getTitle(), "Demo Web Shop. Register", "register page is not dfisplayed");
		Reporter.log("register page displayed", true);
//registering details
		RegisterPage r = new RegisterPage(d);
		r.getGender().click();
		r.getFirst_name().sendKeys(du.excell_data("RegisterDetailes", 1, 0));
		r.getLast_name().sendKeys(du.excell_data("RegisterDetailes", 1, 1));
		r.getEmail().sendKeys(du.excell_data("RegisterDetailes", 1, 2));
		r.getPassword().sendKeys(du.excell_data("RegisterDetailes", 1, 3));
		r.getConfirmPassword().sendKeys(du.excell_data("RegisterDetailes", 1, 4));
		r.getRegisterbtn().click();
		Thread.sleep(3000);
		d.close();

	}
}
