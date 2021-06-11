package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;

public class Login {
    private WebDriver driver;
    private By sign_in=By.className("login");
    private By email=By.id("email");
    private By password=By.id("passwd");
    private By signout=By.xpath("//a[@title='Log me out']");

    public Login(WebDriver driver) {
	this.driver = driver;
    }
    public void login(String Un ,String Pw) {
    	new ElementActions(driver).click(sign_in);
	new ElementActions(driver).type(email, Un);
	new ElementActions(driver).type(password, Pw).keyPress(password, Keys.ENTER);
	Assertions.assertElementAttribute(driver, signout, "Text", "Sign out");
    
    }

}
