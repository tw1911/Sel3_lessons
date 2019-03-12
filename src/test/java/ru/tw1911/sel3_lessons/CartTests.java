package ru.tw1911.sel3_lessons;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import ru.tw1911.sel3_lessons.config.TestSystemConfig;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CartTests extends BasicTest {

    @Before
    public void setUp(){
        super.setUp();
        driver.get(TestSystemConfig.baseUrl);
    }
    
    @Test
    public void addProductToCartTest(){
        for (int i = 0;i<3;i++){
            addProductToCart();
            driver.get(TestSystemConfig.baseUrl);
        }
        String itemLocator = ".dataTable tr:not([class]) td.item";
        driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
        while (isElementPresent(By.cssSelector(itemLocator))){
            int tableSize = driver.findElements(By.cssSelector(itemLocator)).size();
            WebElement removeButton = driver.findElement(By.cssSelector("button[name='remove_cart_item']"));
            removeButton.click();
            wait.until(webDriver -> {
                List<WebElement> rows = webDriver.findElements(By.cssSelector(itemLocator));
                return rows.size() == tableSize-1;
            });
        }
    }

    private boolean isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }

     private void addProductToCart(){
         driver.findElement(By.cssSelector("div#box-most-popular li.product:first-of-type")).click();
         int oldCount = Integer.parseInt(driver.findElement(By.cssSelector("div#cart span.quantity")).getText());
         System.out.println(oldCount);
         if (isElementPresent(By.cssSelector("div#box-product select[name='options[Size]']"))){
             new Select(driver.findElement(By.cssSelector("div#box-product select[name='options[Size]']"))).selectByVisibleText("Small");
         }
         driver.findElement(By.cssSelector("button[name='add_cart_product']")).click();
         wait.until(ExpectedConditions.textToBe(By.cssSelector("div#cart span.quantity"),String.valueOf(oldCount+1)));
     }
}
