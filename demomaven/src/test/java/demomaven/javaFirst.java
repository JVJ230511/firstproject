package demomaven;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class javaFirst {

	public static void main(String[] args) throws IOException {
		ExtentReports extentReports=new ExtentReports();
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("report.html");
		extentReports.attachReporter(extentSparkReporter);
		ExtentTest extentTest=extentReports.createTest("first test");
		extentTest.log(Status.PASS,"test case passed");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.close();
		extentReports.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());
	}

}
