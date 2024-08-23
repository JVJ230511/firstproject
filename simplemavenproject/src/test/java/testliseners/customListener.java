package testliseners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.google.common.io.Files;

public class customListener extends TestListenerAdapter
{
	static int i=0;
	static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test case name is"+tr.getName());
	}
	@Override
	public void onTestFailure(ITestResult tr) {
		File scrFile=(File)((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(scrFile, new File("C:\\wipro java programs\\simplemavenproject\\src\\test\\resources\\screenshot\\image"+i+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}
	

}
