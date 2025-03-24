package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends PageBase{


    public DashBoardPage(WebDriver driver) {
        super(driver);
    }
    String url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
    public String dashboradtext="Dashboard";
    By actualresullt= By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");
    public String actualresultassert()
    {
        return driver.findElement(actualresullt).getText();
    }

}
