package Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profilepage {

	private WebDriver driver;

	private By Ordershistory =
			By.className("icon-list-ol");
	private By Orderdetails =
			By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a");
	private By Assertproduct =
			By.className("address_firstname");

	//Construction

	public Profilepage (WebDriver driver){
		this.driver = driver; }

	public void Clickonordershistory ()
	{
		driver.findElement(Ordershistory).click();

	}
	public void Clickonordersdetails ()
	{
		driver.findElement(Orderdetails).click();

	}

	public void Assertonordershistory (String ProfileAssertproduct)
	{
		String Text = driver.findElement(Assertproduct).getText();
		assertTrue(Text.contains(ProfileAssertproduct));

	}




}
