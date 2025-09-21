package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest
{
	@BeforeMethod
	public void setup()
	{
		super.SetUp();
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void testlogin()
	{
		LoginPage loginPage = new LoginPage(page);
        loginPage.login("Admin", "admin123");
        
        assert page.url().contains("dashboard");
        
        page.waitForTimeout(2000);
    }

    @AfterMethod
    public void tearDownTest() 
    {
        super.teardown();
    }
}
	

