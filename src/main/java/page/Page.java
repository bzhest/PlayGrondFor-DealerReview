package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;
import utility.ApplicationManager;

/**
 * Created by Andrey on 19.04.2017.
 */
public class Page {


    protected WebDriver driver;
    public Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);


    }

}
