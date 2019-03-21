package ru.tw1911.sel3_lessons;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.UUID;

public class AddProductTests extends BasicTest{

//    @Test
//    public void addProductTest(){
//        adminHelper.login("admin", "admin");
//        adminHelper.clickMenuItem("Catalog");
//        driver.findElement(By.xpath("//a[contains(text(),'Add New Product')]")).click();
//        driver.findElement(By.xpath("//label[contains(text(),'Enabled')]/input")).click();
//        String productName = "someProduct"+ UUID.randomUUID().toString().substring(15);
//        driver.findElement(By.cssSelector("input[name='name[en]']")).sendKeys(productName);
//        driver.findElement(By.cssSelector("input[name='code']")).sendKeys(RandomStringUtils.randomNumeric(8));
//        driver.findElement(By.xpath("//td[strong='Product Groups']//td[text()='Female']/preceding-sibling::td")).click();
//        driver.findElement(By.name("quantity")).sendKeys("5");
//        String filepath = System.getProperty("user.dir")+"/src/test/resources/PutIn.jpg";
//        driver.findElement(By.cssSelector("input[type='file']")).sendKeys(filepath);
//        openTab("Information");
//
//        Select manufactorer = new Select(driver.findElement(By.name("manufacturer_id")));
//        manufactorer.selectByVisibleText("ACME Corp.");
//        driver.findElement(By.name("keywords")).sendKeys("put in toy");
//        driver.findElement(By.name("short_description[en]")).sendKeys("put in toy to play with bear and yellow duck");
//        driver.findElement(By.className("trumbowyg-editor")).sendKeys("put in toy to play with bear and yellow duck"+Keys.ENTER+"Logn description");
//        driver.findElement(By.name("head_title[en]")).sendKeys("PutIn yellow duck");
//        driver.findElement(By.name("meta_description[en]")).sendKeys("putIn yellow duck");
//
//        openTab("Prices");
//        WebElement priceField = driver.findElement(By.name("purchase_price"));
//        priceField.clear();
//        priceField.sendKeys("100");
//
//        Select priceCurrency = new Select(driver.findElement(By.name("purchase_price_currency_code")));
//        priceCurrency.selectByValue("USD");
//        driver.findElement(By.name("prices[USD]")).sendKeys("100");
//        driver.findElement(By.name("prices[EUR]")).sendKeys("80");
//
//        driver.findElement(By.name("save")).click();
//        WebElement dataTable = driver.findElement(By.className("dataTable"));
//        dataTable.findElement(By.xpath(String.format(".//tr/td/a[text()='%s']",productName))).isDisplayed();
//    }
//
//    private void openTab(String tabName){
//        driver.findElement(By.xpath(String.format("//div[@class='tabs']//a[text()='%s']",tabName))).click();
//    }
}
