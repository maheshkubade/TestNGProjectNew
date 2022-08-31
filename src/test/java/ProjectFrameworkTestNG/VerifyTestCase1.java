package ProjectFrameworkTestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import FullPageObjectModel.LoginPageObjects;
import Resourses.BaseClass;
import Resourses.CommonUtilities;
import Resourses.TestCaseData;

public class VerifyTestCase1 extends BaseClass {
	@Test
	public void FirstPageLogin() throws IOException {

		LoginPageObjects FirstPage = new LoginPageObjects(driver);
		FirstPage.AddUsername().sendKeys(TestCaseData.AnyUsername);
		FirstPage.AddPassword().sendKeys(TestCaseData.AnyPassword);
		FirstPage.PressButton().click();

		// SoftAssertion

		String ErrorMessage = TestCaseData.LoginErrorMessage;

		String Element = driver.findElement(By.xpath("(//div[@class='loginError'])[2]")).getText();

		CommonUtilities.AnyAsserstion(ErrorMessage, Element);
	}
}
