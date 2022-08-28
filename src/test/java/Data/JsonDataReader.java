package Data;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader {

	public String SigninUsername, SigninPassword , SigninAssert ,
	RegInsertemail , RegFirstname,RegLastname, RegisterPassword , RegAdresscompany , RegAdress1 ,RegAdresscity ,RegAdresspostalcode , RegAdressAdditionalinfo
	, RegAdresshomephone ,RegAdressmobilephone , RegRefrenceadress, RegistrationAssert,
	CheckoutAdressInsertcomment,CheckoutAssertOrder ,
	ProfileAssertproduct;

	public void JsonReader() throws IOException, ParseException 

	{
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserData.json";
		File srcFile = new File(filePath); 
		JSONParser parser = new JSONParser(); 
		JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile)); 
		for(Object jsonObj : jarray) 
		{
			JSONObject person = (JSONObject) jsonObj ; 

			SigninUsername = (String) person.get("SigninUsernameJ"); 
			System.out.println(SigninUsername);	
			SigninPassword = (String) person.get("SigninPasswordJ"); 
			System.out.println(SigninPassword);	
			SigninAssert = (String) person.get("SigninAssertJ"); 
			System.out.println(SigninAssert);	
			
			
			RegInsertemail = (String) person.get("RegInsertemailJ"); 
			System.out.println(RegInsertemail);	
			RegFirstname = (String) person.get("RegFirstnameJ"); 
			System.out.println(RegFirstname);				
			RegLastname = (String) person.get("RegLastnameJ"); 
			System.out.println(RegLastname);			
			RegisterPassword = (String) person.get("RegisterPasswordJ"); 
			System.out.println(RegisterPassword);				
			RegAdresscompany = (String) person.get("RegAdresscompanyJ"); 
			System.out.println(RegAdresscompany);			
			RegAdress1 = (String) person.get("RegAdress1J"); 
			System.out.println(RegAdress1);		
			RegAdresscity = (String) person.get("RegAdresscityJ"); 
			System.out.println(RegAdresscity);				
			RegAdresspostalcode = (String) person.get("RegAdresspostalcodeJ"); 
			System.out.println(RegAdresspostalcode);				
			RegAdressAdditionalinfo = (String) person.get("RegAdressAdditionalinfoJ"); 
			System.out.println(RegAdressAdditionalinfo);				
			RegAdresshomephone = (String) person.get("RegAdresshomephoneJ"); 
			System.out.println(RegAdresshomephone);				
			RegAdressmobilephone = (String) person.get("RegAdressmobilephoneJ"); 
			System.out.println(RegAdressmobilephone);				
			RegRefrenceadress = (String) person.get("RegRefrenceadressJ"); 
			System.out.println(RegRefrenceadress);				
			RegistrationAssert = (String) person.get("RegistrationAssertJ"); 
			System.out.println(RegistrationAssert);	
			
			CheckoutAdressInsertcomment = (String) person.get("CheckoutAdressInsertcommentJ"); 
			System.out.println(CheckoutAdressInsertcomment);	
			CheckoutAssertOrder = (String) person.get("CheckoutAssertOrderJ"); 
			System.out.println(CheckoutAssertOrder);
			
			ProfileAssertproduct = (String) person.get("ProfileAssertproductJ"); 
			System.out.println(ProfileAssertproduct);
			
			

			
		
		}

	}

}

