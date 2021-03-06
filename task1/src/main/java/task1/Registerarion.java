package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;


public class Registerarion {
	private WebDriver driver;
	private By sign_in=By.className("login");
    private By Email=By.id("email_create");
    private By first_name=By.id("customer_firstname");
    private By lastname=By.id("customer_lastname");
    private By password=By.id("passwd");
    private By add_firstname=By.id("firstname");
    private By add_lastname=By.id("lastname");
    private By address=By.id("address1");
    private By city=By.id("city");
    private By postcode=By.id("postcode");
    private By mobile=By.id("phone_mobile");
    private By alias=By.id("alias");
    private By create=By.xpath("//span[normalize-space()='Register']");
    private By my_account=By.xpath("//h1[normalize-space()='My account']");


    String URL ;
    
    public Registerarion(WebDriver driver) {
    	this.driver = driver;
        }
   public void Register()
   {
	   
	   new ElementActions(driver).click(sign_in);
	   new ElementActions(driver).type(Email, "diaatest446@gmail.com").keyPress(Email, Keys.ENTER);
	   new ElementActions(driver).type(first_name, "diaa");
	   new ElementActions(driver).type(lastname, "sayed");
	   new ElementActions(driver).typeAppend(password, "123456");
	   new ElementActions(driver).type(add_firstname, "diaa");
	   new ElementActions(driver).type(add_lastname, "sayed");
	   new ElementActions(driver).type(address, "abcdef");
	   new ElementActions(driver).type(city, "cairo");
	    Select drpstate = new Select(driver.findElement(By.id("id_state")));
	    Select drpscount = new Select(driver.findElement(By.id("id_country")));
	   drpstate.selectByVisibleText("Alaska");
	   new ElementActions(driver).typeAppend(postcode, "12345");
	   drpscount.selectByVisibleText("United States");
	   new ElementActions(driver).typeAppend(mobile, "0123456");
	   new ElementActions(driver).typeAppend(alias, "abc");
	   new ElementActions(driver).click(create);
	  


   }

}
