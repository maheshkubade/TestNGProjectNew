package FullPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpObjectModel {
	public WebDriver driver;

	By FirstName = By.xpath("//input[@name='UserFirstName']");
	By LastName = By.xpath("//input[@name='UserLastName']");
	By Usertitle = By.xpath("//input[@name='UserTitle']");
	By Email = By.xpath("//input[@name='UserEmail']");
	By PhoneNumber = By.xpath("//input[@name='UserPhone']");
	By CampanyName = By.xpath("//input[@name='CompanyName']");
	By CompanyEmployee = By.xpath("//Select[@name='CompanyEmployees']");
	By CompanyCountry = By.xpath("//select[@name='CompanyCountry']");
	By Companylanguage = By.xpath("//select[@name='CompanyLanguage']");
	By CompanyState = By.xpath("//select[@name='CompanyState']");

	public SignUpObjectModel(WebDriver driver2) {
		this.driver = driver2;
		// TODO Auto-generated constructor stub
	}

	public WebElement Firstname() {
		return driver.findElement(FirstName);
	}

	public WebElement LastName() {
		return driver.findElement(LastName);
	}

	public WebElement Usertitle() {
		return driver.findElement(Usertitle);
	}

	public WebElement Email() {
		return driver.findElement(Email);
	}

	public WebElement PhoneNumber() {
		return driver.findElement(PhoneNumber);
	}

	public WebElement SCampanyName() {
		return driver.findElement(CampanyName);
	}

	public WebElement SCompanyEmployee() {
		return driver.findElement(CompanyEmployee);
	}

	public WebElement SCompanyCountry() {
		return driver.findElement(CompanyCountry);
	}

	public WebElement SLanguage() {
		return driver.findElement(Companylanguage);
	}

	public WebElement SState() {
		return driver.findElement(CompanyState);
	}
}
