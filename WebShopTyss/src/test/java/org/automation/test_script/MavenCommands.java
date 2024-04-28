package org.automation.test_script;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenCommands {
@Test
public void maven_Commands() {
	String url=System.getProperty("URL");
	String email= System.getProperty("EMAIL");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	d.get(url);
	System.out.println("---------------------");
	System.out.println(d.getTitle());
	System.out.println(url);
	System.out.println(email);
	System.out.println("----------------------");
	d.close();
}
}
