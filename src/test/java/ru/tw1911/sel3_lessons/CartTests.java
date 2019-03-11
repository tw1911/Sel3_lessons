package ru.tw1911.sel3_lessons;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import ru.tw1911.sel3_lessons.config.TestSystemConfig;

public class CartTests extends BasicTest {

    @Before
    public void setUp(){
        super.setUp();
        driver.get(TestSystemConfig.baseUrl);
    }
    
    @Test
    public void addProductToCartTest(){
        driver.findElement(By.cssSelector("div#box-most-popular li.product:first-of-type")).click();
    }
}
