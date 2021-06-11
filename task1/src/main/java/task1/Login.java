package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.shaft.gui.element.ElementActions;

public class Login {
    private WebDriver driver;
    private By sign_in=By.className("login");
    private By email=By.id("email");
    private By password=By.id("passwd");

    public Login(WebDriver driver) {
	this.driver = driver;
    }
    public void login() {
    	new ElementActions(driver).click(sign_in);
	new ElementActions(driver).type(email, "diaatest46@gmail.com");
	new ElementActions(driver).type(password, "123456").keyPress(password, Keys.ENTER);
    
    }

}
