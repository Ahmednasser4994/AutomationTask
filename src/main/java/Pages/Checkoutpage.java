package Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkoutpage {
	
	private WebDriver driver;

	 private By Dress1 =
	            By.xpath("//*[@id=\"center_column\"]/ul/li[1]");
	 
  private By MoreDress =
    		By.cssSelector("a[class='button lnk_view btn btn-default'");
	 
    private By Sizerdropdown =
            By.id("group_1");
    private By Orangecolor =
            By.name("Orange");
    private By Addtocartbutton =
            By.id("add_to_cart");
    private By Proceedtocheckout =
            By.cssSelector( "a[class='btn btn-default button button-medium'");
    private By Proceedtocheckout2 =
          By.cssSelector( "a[class='button btn btn-default standard-checkout button-medium'");
  
    private By AdressInsertcomment =
          By.name("message");
    private By Adresssubmit =
          By.name("processAddress");
  
    private By Shipmentcheckbox =
          By.id("cgv");
    private By Shipmentsubmit =
          By.name("processCarrier");
  
    private By PaymentCheque =
          By.className("bankwire");
    private By OrderConfirmation =
            By.xpath("//*[@id=\"cart_navigation\"]/button");
    private By AssertOrder =
            By.className("cheque-indent");
 
    
    
   
    
  //Construction
    
    public Checkoutpage (WebDriver driver){
        this.driver = driver; }
    
    public void MakeCheckout ()
    {
    driver.findElement(Dress1).click();
   driver.findElement(MoreDress).click();
    
    }
    public void Itempopup ()
    {
    WebElement state = driver.findElement(Sizerdropdown);
	Select statech = new Select(state);
	statech.selectByVisibleText("L");
	driver.findElement(Orangecolor).click();
	driver.findElement(Addtocartbutton).click();
    }
	
	public void Proceedtocheckout ()
    {
	driver.findElement(Proceedtocheckout).click();
	driver.findElement(Proceedtocheckout2).click();
	
    }
	public void Adresscheckout (String CheckoutAdressInsertcomment )
	{
		driver.findElement(AdressInsertcomment).sendKeys(CheckoutAdressInsertcomment);
		driver.findElement(Adresssubmit).click();
    }
	
	public void ShipmentProceedtocheckout ()
	{
		driver.findElement(Shipmentcheckbox).click();
		driver.findElement(Shipmentsubmit).click();
    }
	
	public void paymentProceedtocheckout ()
    {
		
		driver.findElement(PaymentCheque).click();
		driver.findElement(OrderConfirmation).click();
    }
	
	public void Assertorder (String CheckoutAssertOrder)
    {
    	 String Text = driver.findElement(AssertOrder).getText();
         assertTrue(Text.contains(CheckoutAssertOrder));
    }
    

    }
    


