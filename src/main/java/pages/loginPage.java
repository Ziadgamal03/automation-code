package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends PageBase {


    By username= By.xpath("//input[@placeholder=\"Username\"]");
    By password=By.xpath("//input[@name=\"password\"]");
    By loginbutton=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");

    public loginPage(WebDriver driver) {
        super(driver);
    }

    public void fillusername(String name) { sendkey(username,name); }
    public void fillpassword(String pass) { sendkey(password,pass); }
    public void clicklogin() { clickkey(loginbutton); }


}
