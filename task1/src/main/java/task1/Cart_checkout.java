package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;

public class Cart_checkout {
	
	private WebDriver driver;
	private By Home=By.xpath("//span[normalize-space()='Home']");
    private By View_product=By.xpath("//body/div[@id='page']/div/div[@id='columns']/div/div[@id='center_column']/div/ul[@id='homefeatured']/li[1]/div[1]");
    private By add_cart=By.xpath("//span[normalize-space()='Add to cart']");
    private By proceed=By.xpath("//span[normalize-space()='Proceed to checkout']");
    private By proceed_2=By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
    private By proceed_3=By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]");
    private By agree=By.xpath("//label[contains(text(),'I agree to the terms of service and will adhere to')]");
    private By proceed_4=By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");
    private By select_pay=By.xpath("//a[@title='Pay by bank wire']");
    private By confirm=By.xpath("//span[normalize-space()='I confirm my order']");
    
    public Cart_checkout(WebDriver driver) {
    	this.driver = driver;
        }
    
    public void checkout()
    {
 	   
 	   new ElementActions(driver).click(Home);
 	   new ElementActions(driver).click(View_product);
 	   new ElementActions(driver).click(add_cart);
 	   new ElementActions(driver).click(proceed);
 	   new ElementActions(driver).click(proceed_2);
 	   new ElementActions(driver).click(proceed_3);
 	   new ElementActions(driver).click(agree);
 	   new ElementActions(driver).click(proceed_4);
 	   new ElementActions(driver).click(select_pay);
 	   Assertions.assertElementAttribute(driver, confirm, "Text", "I confirm my order");
 	   new ElementActions(driver).click(confirm);
 	   
 	   
    }
    
}
