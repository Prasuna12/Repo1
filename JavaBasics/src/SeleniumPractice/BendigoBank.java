package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BendigoBank {

	@Test
	public void TestMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bendigobank.com.au/");
		driver.findElement(By.xpath("//button[starts-with(@id,'BendigoBankHeaderConfig')]"));
		driver.findElement(By.xpath("//a[contains(text(),'Bank accounts')]")).click();
		driver.quit();

	}

}
