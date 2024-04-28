package org.automation.generic_library;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods implements FrameWorkConstant {
	public void screenShot(WebDriver d, String name) {
		String path = screenshot_path + name + ".png";
		TakesScreenshot ts = (TakesScreenshot) d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(path);
		try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void alert_popup(WebDriver d) {
		Alert alt = d.switchTo().alert();
		alt.accept();
	}

	public void Prompt_alert_popup(WebDriver d, String message) {
		Alert alt = d.switchTo().alert();
		d.switchTo().alert().sendKeys(message);
		alt.accept();
	}

	public void drop_Down(WebElement dropdown, int v) {
		Select s = new Select(dropdown);
		s.selectByIndex(v);
	}

	public void drop_Down_value(WebElement dropdown, String v) {
		Select s = new Select(dropdown);
		s.selectByValue(v);
	}

	public void drop_Down_visible_text(WebElement dropdown, String v) {
		Select s = new Select(dropdown);
		s.selectByVisibleText(v);
	}

	public int randomnum() {
		Random r = new Random();
		int num = r.nextInt(4000);
		return num;
	}

	public void Scroll(WebDriver d, WebElement element) {
		Actions a = new Actions(d);
		a.scrollToElement(element);
	}
}
