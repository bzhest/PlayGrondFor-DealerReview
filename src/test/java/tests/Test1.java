package tests;

import base.Base1;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Andrey on 19.04.2017.
 */
public class Test1 extends Base1 {
    @Test
    public void isWidgetDisplayed() {
        driver.get("someURL");


    }
}
