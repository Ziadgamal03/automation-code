package tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.loginPage;

public class LoginTest extends testbase {
loginPage login;

@BeforeMethod
public void init()
{
    login=new loginPage(driver);
}
@Test
public void loginwithvaliduserandpass()
{
    login.fillusername("Admin");
    login.fillpassword("admin123");
    login.clicklogin();
}


}

