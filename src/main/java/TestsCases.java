import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by DWork on 06.06.2017.
 */
public class TestsCases extends Base {

    @Test
    public void isWidgetDisplayed() {

        Assert.assertTrue(true);
    }

    @Test
    public void isWidgetTitleDisplayed() {

        Assert.assertTrue(driver.getCurrentUrl().equals(("http://www.solomia.andreyb.ixloo.com/dealer-review-form_dealer_6286.html")));
    }

}
