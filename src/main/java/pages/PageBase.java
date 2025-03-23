package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {
    WebDriver driver;
    public PageBase(WebDriver driver)
    {
        this.driver=driver;
    }


    public void sendkey(By elemnt , String fill)
    {
        driver.findElement(elemnt).sendKeys(fill);
    }
    public void clickkey(By elemnt)
    {
        driver.findElement(elemnt).click();
    }
}
