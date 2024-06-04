package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumTestClass {

	@Test
	public void mainTest()
	{
	//public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("============"+driver.getTitle()+"=============");
		
		driver.quit();
		
		System.out.println("============Task completed========");
	}

}
