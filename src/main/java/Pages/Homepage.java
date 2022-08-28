package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	private WebDriver driver;

	private By Signin =
			By.className("login");

	private By Dresstab =
			By.className("sf-with-ul");

	private By profile =
			By.className("header_user_info");



	// Constructor
	public Homepage (WebDriver driver){
		this.driver = driver; }

	//Method
	public void Clickonsignin ()
	{
		driver.findElement(Signin).click();

	}

	public void Dressestab ()
	{
		//Hover
		WebElement element = driver.findElement(Dresstab);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Summer Dresses"))).click();	
	}
	public void ClickProfile ()
	{
		driver.findElement(profile).click();

	}

}

