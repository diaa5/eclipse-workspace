package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import task1.Environment;
import task1.Registerarion;
import task1.Login;
import task1.Cart_checkout;
public class Checkout {
	
	   private WebDriver driver;
	  
  @Test(priority = 1)
  public void Register() {

   new Registerarion(driver).Register();
   
  }
  @Test
  public void Login() {

   new Login(driver).login();
   
  }
  
  @Test
  public void checkout() {

	  new Login(driver).login();
	  new Cart_checkout(driver).checkout();
	   
	  }

  @BeforeMethod
  public void beforeMethod() {
      driver = BrowserFactory.getBrowser();
      BrowserActions.navigateToURL(driver, Environment.getInstance().baseurl);
  }

  @AfterMethod
  public void afterMethod() {
	  BrowserActions.closeCurrentWindow(driver);
  }

  @BeforeClass
  public void beforeClass() {
    
  }
  
}