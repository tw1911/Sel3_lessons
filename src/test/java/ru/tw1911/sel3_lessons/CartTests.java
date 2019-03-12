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
        int oldCount = Integer.parseInt(driver.findElement(By.cssSelector("div#cart span.quantity")).getText());
        System.out.println(oldCount);
        if (isElementPresent(By.cssSelector("div#box-product select[name='options[Size]']"))){
            System.out.println("Yellow duck!");
        }
    }

    private boolean isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }
}
