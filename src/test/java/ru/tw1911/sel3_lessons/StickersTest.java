package ru.tw1911.sel3_lessons;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.tw1911.sel3_lessons.config.TestSystemConfig;

import java.util.List;

import static org.junit.Assert.*;

public class StickersTest extends BasicTest{

    @Test
    public void CheckStickersOnMainPage(){
        driver.get(TestSystemConfig.baseUrl);
        List<WebElement> products = driver.findElements(By.className("product"));
        for (WebElement product: products){
            List<WebElement> stickers = product.findElements(By.className("sticker"));
            assertEquals(stickers.size(),1);
        }
    }
}
