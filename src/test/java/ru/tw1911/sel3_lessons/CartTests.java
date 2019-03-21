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
        for (int i=0;i<3;i++){
            app.addProductToCart();
        }
        app.clearCart();
    }
}
