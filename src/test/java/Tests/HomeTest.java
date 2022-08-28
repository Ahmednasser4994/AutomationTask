package Tests;

import org.testng.annotations.Test;

import Pages.Homepage;

public class HomeTest extends Baseclass {
	
	@Test
    public void ClickonSignin ()
    {
       // object
        Homepage homepage = new Homepage(driver);
        homepage.Clickonsignin();

    }

}
