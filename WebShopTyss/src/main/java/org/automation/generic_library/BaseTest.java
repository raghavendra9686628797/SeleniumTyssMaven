package org.automation.generic_library;

import java.io.IOException;
import java.time.Duration;

import org.automation.element_Repository.Homepage;
import org.automation.element_Repository.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements FrameWorkConstant {
	public DataUtility du = new DataUtility();
	public static WebDriver d;
	public Homepage h;

	@BeforeClass
	public void launch_Browser() throws IOException {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitwait_Time));
		d.get(du.property_data("url"));
	}

	@BeforeMethod
	public void login() throws IOException {
		h = new Homepage(d);
		h.getLogin().click();
		LoginPage l = new LoginPage(d);
		l.getEmailtextfield().sendKeys(du.property_data("email"));
		l.getPasswordtextfield().sendKeys(du.property_data("pwd"));
		l.getLoginbtn().click();
//	d.findElement(By.xpath("//a[text()='Log in']")).click();
//	d.findElement(By.id("Email")).sendKeys(cgm.property_data("email"));
//	d.findElement(By.id("Password")).sendKeys(cgm.property_data("pwd"));
//	d.findElement(By.xpath("//input[@class='button-1 login-button']")).click();	
	}

	@AfterMethod
	public void logout() {
		h.getLogout().click();
//d.findElement(By.xpath("//a[text()='Log out']")).click();	
	}

	@AfterClass
	public void close_Browser() {
		d.close();
	}
}
