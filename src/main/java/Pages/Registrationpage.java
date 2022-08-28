package Pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Registrationpage {

	private WebDriver driver;

	private By Insertemail =
			By.id("email_create");

	private By ClickonCreateanaccount =
			By.id("SubmitCreate");

	private By GenderRadiobuttonm =
			By.id("uniform-id_gender1");

	private By Firstname =
			By.id("customer_firstname");

	private By Lastname =
			By.id("customer_lastname");

	private By RegisterrPassword =
			By.id("passwd");

	private By Registerbirthday =
			By.id("days");

	private By Registerbirthmonth =
			By.id("months");

	private By Registerbirthyear =
			By.id("years");

	private By RegisterNewslettercheckin =
			By.id("newsletter");


	private By Registerspecialoffercheckin =
			By.id("optin");

	private By Adresscompany =
			By.id("company");

	private By Adress1 =
			By.id("address1");

	private By Adress2 =
			By.id("address2");

	private By Adresscity =
			By.id("city");

	private By Adressstate =
			By.id("id_state");

	private By Adresspostalcode =
			By.id("postcode");

	private By Adresscountry =
			By.id("id_country");

	private By AdressAdditionalinfo =
			By.id("other");

	private By Adresshomephone =
			By.id("phone");

	private By Adressmobilephone =
			By.id("phone_mobile");

	private By Refrenceadress =
			By.id("alias");

	private By Registersubmitbutton =
			By.id("submitAccount");

	private By AssertforRegistration =
			By.className("info-account");


	//Construction
	public Registrationpage (WebDriver driver){
		this.driver = driver; }

	public void MakeRegistration (String RegInsertemail , String RegFirstname, String RegLastname , String RegisterPassword,
			String RegAdresscompany, String RegAdress1 , String RegAdresscity ,String RegAdresspostalcode, String RegAdressAdditionalinfo
			, String RegAdresshomephone ,String RegAdressmobilephone ,String RegRefrenceadress )
	{
		driver.findElement(Insertemail).sendKeys(RegInsertemail);
		driver.findElement(ClickonCreateanaccount).click();
		driver.findElement(GenderRadiobuttonm).click();
		driver.findElement(Firstname).sendKeys(RegFirstname);
		driver.findElement(Lastname).sendKeys(RegLastname);
		driver.findElement(RegisterrPassword).sendKeys(RegisterPassword);

		WebElement day = driver.findElement(Registerbirthday);
		Select dayCombo = new Select(day);
		dayCombo.selectByValue("9");

		WebElement month = driver.findElement(Registerbirthmonth);
		Select monthCombo = new Select(month);
		monthCombo.selectByValue("8");

		WebElement year = driver.findElement(Registerbirthyear);
		Select yearCombo = new Select(year);
		yearCombo.selectByValue("1994");


		driver.findElement(RegisterNewslettercheckin).click();
		driver.findElement(Registerspecialoffercheckin).click();
		driver.findElement(Adresscompany).sendKeys(RegAdresscompany);
		driver.findElement(Adress1).sendKeys(RegAdress1);
		driver.findElement(Adresscity).sendKeys(RegAdresscity);

		WebElement state = driver.findElement(Adressstate);
		Select statech = new Select(state);
		statech.selectByVisibleText("Alaska");


		driver.findElement(Adresspostalcode).sendKeys(RegAdresspostalcode);

		WebElement Country = driver.findElement(Adresscountry);
		Select Countrych = new Select(Country);
		Countrych.selectByVisibleText("United States");

		driver.findElement(AdressAdditionalinfo).sendKeys(RegAdressAdditionalinfo);
		driver.findElement(Adresshomephone).sendKeys(RegAdresshomephone);
		driver.findElement(Adressmobilephone).sendKeys(RegAdressmobilephone);
		driver.findElement(Refrenceadress).sendKeys(RegRefrenceadress);
		driver.findElement(Registersubmitbutton).click();

	}
	public void AssertRegistration (String RegistrationAssert)
	{

		String Text = driver.findElement(AssertforRegistration).getText();
		assertTrue(Text.contains(RegistrationAssert));


	}

}
