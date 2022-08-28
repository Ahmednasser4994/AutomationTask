package Tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import Data.JsonDataReader;
import Pages.Homepage;
import Pages.Registrationpage;

public class Registrationtest extends Baseclass {

	
	@Test
	
	 public void ClickonSignin () throws IOException, ParseException
    {
		
		JsonDataReader JsonReader = new JsonDataReader();
		JsonReader.JsonReader();
		
       // object
        Homepage homepage = new Homepage(driver);
        homepage.Clickonsignin();
      
        Registrationpage registration = new Registrationpage(driver);
        registration.MakeRegistration(JsonReader.RegInsertemail , JsonReader.RegFirstname,JsonReader.RegLastname, JsonReader.RegisterPassword , 
        		JsonReader.RegAdresscompany , JsonReader.RegAdress1 ,JsonReader.RegAdresscity ,JsonReader.RegAdresspostalcode , JsonReader.RegAdressAdditionalinfo
        		, JsonReader.RegAdresshomephone ,JsonReader.RegAdressmobilephone , JsonReader.RegRefrenceadress);
        
        registration.AssertRegistration(JsonReader.RegistrationAssert);
    }
	
	
}
