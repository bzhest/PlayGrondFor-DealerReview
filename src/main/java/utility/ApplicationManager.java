package utility;

import dms.LoginForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Andrey on 19.04.2017.
 */
public class ApplicationManager {

    private LoginForm loginForm;
    private static WebDriver driver;
    private static ApplicationManager instance;

    public static WebDriver getDriver() {
        return driver;
    }

    public ApplicationManager(WebDriver driver){
        if(loginForm ==null){
            loginForm = new LoginForm(driver);
        }


    }
    public static ApplicationManager getInstance(WebDriver driver){

        if (instance ==null)
            instance = new ApplicationManager(driver);
        return instance;
    }
    public void setDriver(WebDriver driver) {this.driver = driver;}

    public LoginForm getLoginForm() {return loginForm;}


}
