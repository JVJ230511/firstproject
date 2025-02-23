package testng;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simpleclass {
@Test
public void start()
{
	//soft assertion
	SoftAssert softAssert=new SoftAssert();
	System.out.println("ss started");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	String title=driver.getTitle();
	softAssert.assertEquals(title,"Google1","title mismatch");//it fails title mismatch
	String url=driver.getCurrentUrl();
	softAssert.assertEquals(url, "https://www.google.co.in/");
	driver.quit();
	softAssert.assertAll();//it throw exceptions after executed all code
}
}
