package testclasses;

import org.testng.annotations.Test;

import manager.PageManager;
import utillity.BaseTest;

public class ResgisterTest extends BaseTest
{
	@Test
	public void NewRegistration() throws Exception
	{
		PageManager.register.RegisterTab().ClickOnElement();
		PageManager.register.GenderMale().ClickOnElement();
		PageManager.register.FirstName().EnterText("Rohan");
		PageManager.register.LastName().EnterText("Jawade");
		PageManager.register.DateOfBirthDay().SelectValueFromDropDown("14");
		PageManager.register.DateOfBirthMonth().SelectValueFromDropDown("June");
		PageManager.register.DateOfBirthYear().SelectValueFromDropDown("1993");
		PageManager.register.Email().EnterText("rohan@gmail.com");
		PageManager.register.Password().EnterText("rohan@123");
		PageManager.register.ConfirmPassword().EnterText("rohan@123");
		PageManager.register.Register().ClickOnElement();
		System.out.println();
		System.out.println(" code execute successfully");
	}
}
