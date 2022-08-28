package Tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import Data.JsonDataReader;
import Pages.Homepage;
import Pages.Profilepage;
import Pages.Signinpage;

public class Profiletest extends Baseclass{
	
	@Test
	 public void CheckOrderhistory () throws IOException, ParseException
	    {
		
		JsonDataReader JsonReader = new JsonDataReader();
		JsonReader.JsonReader();
	       
		// object
	        Homepage homepage = new Homepage(driver);
	        homepage.Clickonsignin();
	        
	        Signinpage signin =new Signinpage(driver);
	        signin.Clickonsignin(JsonReader.SigninUsername,JsonReader.SigninPassword);
	        
	        
	        homepage.ClickProfile();
	    
	    Profilepage profilepage = new Profilepage(driver);
	    profilepage.Clickonordershistory();	  
	    profilepage.Clickonordersdetails();
	    profilepage.Assertonordershistory(JsonReader.ProfileAssertproduct);
	    
	    
	    
	    }
}
