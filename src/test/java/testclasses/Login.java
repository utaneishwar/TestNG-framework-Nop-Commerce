package testclasses;

import org.testng.annotations.Test;

import manager.PageManager;
import utillity.BaseTest;

public class Login extends BaseTest
{
	@Test
	public void VerifyInvalidLogin() throws Exception
	{
		PageManager.login.Email().EnterText("niteshbothale@123gmail.com");
		PageManager.login.Password().EnterText("Nitesh@123");
		PageManager.login.Login().ClickOnElement();
		PageManager.login.VallidationMSG().ElementContainsText("Login was unsuccessful. Please correct the errors and try again");
		System.out.println("login verify ");
	}
}
