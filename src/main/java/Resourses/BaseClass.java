package Resourses;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Properties proty;

	public WebDriver browsernewLunch() throws IOException {

		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir")+"\\Data.properties");

		proty = new Properties();

		proty.load(file);

		String browserName = proty.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			// Firefox

		} else if (browserName.equalsIgnoreCase("Edge")) {

			// edge

		} else {

			System.out.print("not browser found");
		}
		return driver;
	}

	@BeforeMethod
	public void AnyBrowserLunch() throws IOException {
		browsernewLunch();
		driver.get(proty.getProperty("url"));

	}

	@AfterMethod
	public void CloseTheAllBrowser() {

		driver.quit();
	}
}
