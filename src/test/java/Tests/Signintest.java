package Tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Data.JsonDataReader;
import Pages.Homepage;
import Pages.Signinpage;

public class Signintest extends Baseclass {
	
	@Test
    public void ClickonSignin () throws IOException, ParseException
    {
		JsonDataReader JsonReader = new JsonDataReader();
		JsonReader.JsonReader();
		
       // object
        Homepage homepage = new Homepage(driver);
        homepage.Clickonsignin();
      
        Signinpage signin =new Signinpage(driver);
        signin.Clickonsignin(JsonReader.SigninUsername,JsonReader.SigninPassword);
        signin.Assertsignin(JsonReader.SigninAssert);
         }

}
