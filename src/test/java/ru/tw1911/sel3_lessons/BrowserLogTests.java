package ru.tw1911.sel3_lessons;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class BrowserLogTests extends BasicTest{

//    @Test
//    public void productPageLotTet(){
//        adminHelper.login("admin","admin");
//        adminHelper.clickMenuItem("Catalog");
//        driver.findElement(By.xpath("//a[text()='Rubber Ducks']")).click();
//        List<String> productLinks = driver.findElement(By.cssSelector(".dataTable"))
//                .findElements(By.xpath(".//td[3]/a[@href[contains(.,'product_id')]]"))
//                .stream()
//                .map(webElement -> webElement.getAttribute("href"))
//                .collect(Collectors.toList());
//        for (String link: productLinks){
//            driver.get(link);
//            Assert.assertTrue(driver.manage().logs().get("browser").getAll().isEmpty());
//        }
//    }
}
