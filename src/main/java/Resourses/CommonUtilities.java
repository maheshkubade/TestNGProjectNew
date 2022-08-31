package Resourses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {



	public  static void  AnyDropDownHandling (WebElement AnyDropDownXpath, int AnyDropDownindexValue) {
		
		Select s=new Select(AnyDropDownXpath) ;
				s.selectByIndex(AnyDropDownindexValue);
	
	}
public static void AnyAsserstion (String errorMessage, String ExpectedResult) {
	
	SoftAssert  asserstion=new SoftAssert();
	asserstion.assertEquals(errorMessage,  ExpectedResult);
	System.out.println("hello");
	asserstion.assertAll();
}
}



