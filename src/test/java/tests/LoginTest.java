package tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.loginPage;

public class LoginTest extends testbase {
loginPage login;
DashBoardPage dash;

@BeforeMethod
public void init()
{
    login=new loginPage(driver);
    dash=new DashBoardPage(driver);
}
@Test
public void loginwithvaliduserandpass() throws InterruptedException {
    login.fillusername("Admin");
    login.fillpassword("admin123");
    login.clicklogin();
    Thread.sleep(5000);
    Assert.assertEquals(dash.actualresultassert(),dash.dashboradtext);
}


}

