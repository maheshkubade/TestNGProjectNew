package FullPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;
	By username = By.xpath("//input[@id='username']");
	By password = By.xpath("//input[@id='password']");
	By LoginClick = By.xpath("//input[@type='submit']");
	By TryForFree = By.xpath("//a[@id='signup_link']");

	public LoginPageObjects(WebDriver driver2) {
		this.driver = driver2;
		// TODO Auto-generated constructor stub
	}

	public WebElement AddUsername() {
		return driver.findElement(username);
	}

	public WebElement AddPassword() {
		return driver.findElement(password);
	}

	public WebElement PressButton() {
		return driver.findElement(LoginClick);

	}

	public WebElement TryForFree() {
		return driver.findElement(TryForFree);
	}
}