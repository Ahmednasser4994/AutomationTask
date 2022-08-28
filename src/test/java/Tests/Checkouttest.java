package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import Data.JsonDataReader;
import Pages.Checkoutpage;
import Pages.Homepage;
import Pages.Signinpage;

public class Checkouttest extends Baseclass{

	@Test
    public void BuyaDress () throws IOException, ParseException
    {
		
		JsonDataReader JsonReader = new JsonDataReader();
		JsonReader.JsonReader();
		
		
       // object
        Homepage homepage = new Homepage(driver);
        homepage.Dressestab();
        
        Checkoutpage checkout = new Checkoutpage(driver);
        checkout.MakeCheckout();
        checkout.Itempopup();
        checkout.Proceedtocheckout();
        
        Signinpage signin =new Signinpage(driver);
        signin.Clickonsignin(JsonReader.SigninUsername,JsonReader.SigninPassword);
      
         checkout.Adresscheckout(JsonReader.CheckoutAdressInsertcomment);
         checkout.ShipmentProceedtocheckout();
         checkout.paymentProceedtocheckout();
         checkout.Assertorder(JsonReader.CheckoutAssertOrder);
         }
}
