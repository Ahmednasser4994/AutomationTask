package Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Signinpage {

	private WebDriver driver;

    private By UserName =
            By.name("email");
    private By Password =
            By.name("passwd");

    private By Submitlogin =
            By.name("SubmitLogin");
    public By Assertsignin =
            By.className("info-account");
    // Constructor
    public Signinpage (WebDriver driver){
        this.driver = driver; }

    //Method
    public void Clickonsignin  (String SigninUsername , String SigninPassword  )
    {
    	
        driver.findElement(UserName).sendKeys(SigninUsername);
        driver.findElement(Password).sendKeys(SigninPassword);
        driver.findElement(Submitlogin).click();
    }
    public void Assertsignin (String SigninAssert)
    {
    	 String Text = driver.findElement(Assertsignin).getText();
         assertTrue(Text.contains(SigninAssert));
    }
}
