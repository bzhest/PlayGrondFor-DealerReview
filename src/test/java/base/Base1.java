package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import utility.ApplicationManager;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andrey on 19.04.2017.
 */
public class Base1 {
    protected ApplicationManager manager;
    protected WebDriver driver;

    @BeforeSuite
    public void turnOnMap2(){

        //manager = ApplicationManager.getInstance(driver);

        System.setProperty("webdriver.chrome.driver", "E://Selenium_Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.solomia.andreyb.ixloo.com/dms");
        manager = ApplicationManager.getInstance(driver);
        //manager = new ApplicationManager(driver);
        //manager.setDriver(driver);
        manager.getLoginForm().loginToDMSUnderUser();
    }
}
