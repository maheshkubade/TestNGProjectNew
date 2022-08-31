package ProjectFrameworkTestNG;

import java.io.IOException;

import org.testng.annotations.Test;

import FullPageObjectModel.LoginPageObjects;
import FullPageObjectModel.SignUpObjectModel;
import Resourses.BaseClass;
import Resourses.CommonUtilities;
import Resourses.TestCaseData;

@Test
public class SignUpTestCase extends BaseClass {

	public void SingUpPage() throws IOException, InterruptedException {

		LoginPageObjects FirstPage = new LoginPageObjects(driver);
		FirstPage.TryForFree().click();
		Thread.sleep(5000);

		
		String ExpectedResultErrorMessage="Sales Cloud Free rial - Salesforce.com";
		String ActualResult=TestCaseData.ExpectedTitleResult;
		CommonUtilities.AnyAsserstion(ExpectedResultErrorMessage, ExpectedResultErrorMessage);
		
		SignUpObjectModel suom = new SignUpObjectModel(driver);
		suom.Firstname().sendKeys(TestCaseData.AnyUsername);
		suom.LastName().sendKeys(TestCaseData.AnyPassword);
		suom.Usertitle().sendKeys(TestCaseData.Usertitle);
		suom.Email().sendKeys(TestCaseData.AnyEmail);
		suom.PhoneNumber().sendKeys(TestCaseData.PhoneNumber);
		suom.SCampanyName().sendKeys(TestCaseData.ComapanyData);
		//System.out.println(driver.getTitle());
		
		
	//	String ActualTitleString=""
	
		CommonUtilities.AnyDropDownHandling(suom.SCompanyCountry(), 3);
		CommonUtilities.AnyDropDownHandling(suom.SCompanyCountry(), 3);
	}
}
