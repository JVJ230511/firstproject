package simplemavenproject;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.util.Assert;

public class ReportGenerator {
	static ExtentReports extentReports;
	static ExtentTest extentTest;
	static int i=1;
	static int j=1;
	public static void startReport() {
		extentReports=new ExtentReports();
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("C:\\wipro java programs\\simplemavenproject\\src\\test\\resources\\reports\\report"+i+".html");
		extentReports.attachReporter(extentSparkReporter);	
	}
	public static void startTest()
	{
		String test="test"+j;
		extentTest=extentReports.createTest(test);
	}
	public static void endTest()
	{
		j++;
	}
	public static void endReport()
	{
		extentReports.flush();
		i++;
	}
	public static void main(String[] args) throws IOException {
		startReport();
		startTest();
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver.get("https://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		String actual="Demo Web Shop";
		extentReports.createTest("Test12").pass("test passed");
		endTest();
		endReport();
		System.out.println("all methods executed");
//		Desktop.getDesktop().browse(new File("C:\\\\wipro java programs\\\\simplemavenproject\\\\src\\\\test\\\\resources\\\\reports\\\\report1.html").toURI());
		
		

	}

}
