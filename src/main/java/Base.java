import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by DWork on 06.06.2017.
 */
public class Base {

    WebDriver driver = new ChromeDriver();
    Wait wait;

    @BeforeClass
    public void setUp() {
        driver.manage().window().setSize(new Dimension(1920,1200));
        driver.get("http://www.solomia.andreyb.ixloo.com/dealer-review-form_dealer_6287.html");
        wait = new WebDriverWait(driver,15);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
