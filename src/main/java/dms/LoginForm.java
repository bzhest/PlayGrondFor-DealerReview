package dms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import page.Page;
import utility.ApplicationManager;

/**
 * Created by Andrey on 19.04.2017.
 */
public class LoginForm extends Page {

    public LoginForm(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.CSS, using = "#login")
    private WebElement loginInput;

    @FindBy(how = How.CSS, using = "#password")
    private  WebElement passwordInput;

    @FindBy(how = How.CSS, using = "#login2")
    private WebElement signInButton;

    public void loginToDMSUnderUser(){

        loginInput.clear();
        loginInput.sendKeys("some login");
        passwordInput.clear();
        passwordInput.sendKeys("some password");
        signInButton.click();

    }
}
