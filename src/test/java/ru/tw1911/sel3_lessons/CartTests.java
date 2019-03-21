package ru.tw1911.sel3_lessons;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import ru.tw1911.sel3_lessons.config.TestSystemConfig;
import ru.tw1911.sel3_lessons.pages.MainShopPage;

import java.util.List;

public class CartTests extends BasicTest {
    @Test
    public void addProductToCartTest(){
//        MainShopPage mainPage = (MainShopPage) navigationHelper.open("Главная страница");
//        for (int i = 0;i<3;i++){
//            app.addProductToCart();
//        }
//        driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
//        while (cartItems().size()>0){
//            removeCurrentItem();
//        }
        for (int i=0;i<3;i++){
            app.addProductToCart();
        }
    }
//
//     private void removeCurrentItem(){
//         String itemLocator = ".dataTable tr:not([class]) td.item";
//         int tableSize = driver.findElements(By.cssSelector(itemLocator)).size();
//         driver.findElement(By.cssSelector("button[name='remove_cart_item']")).click();
//         wait.until(webDriver -> {
//             List<WebElement> rows = webDriver.findElements(By.cssSelector(itemLocator));
//             return rows.size() == tableSize-1;
//         });
//     }
//
//     private List<WebElement> cartItems(){
//        return driver.findElements(By.cssSelector(".dataTable tr:not([class]) td.item"));
//     }
}
