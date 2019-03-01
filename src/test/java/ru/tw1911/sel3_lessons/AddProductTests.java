package ru.tw1911.sel3_lessons;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddProductTests extends BasicTest{

    @Test
    public void addProductTest(){
        adminHelper.login("admin", "admin");
        adminHelper.clickMenuItem("Catalog");
        driver.findElement(By.xpath("//a[contains(text(),'Add New Product')]")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Enabled')]/input")).click();
        driver.findElement(By.cssSelector("input[name='name[en]']")).sendKeys("someProduct");
        driver.findElement(By.cssSelector("input[name='code']")).sendKeys(RandomStringUtils.randomNumeric(8));
        driver.findElement(By.xpath("//td[strong='Product Groups']//td[text()='Female']/preceding-sibling::td")).click();
        driver.findElement(By.name("quantity")).sendKeys("5");
        String filepath = System.getProperty("user.dir")+"/src/test/resources/PutIn.jpg";
        driver.findElement(By.cssSelector("input[type='file']")).sendKeys(filepath);
        driver.findElement(By.xpath("//div[@class='tabs']//a[text()='Information']")).click();

        Select manufactorer = new Select(driver.findElement(By.name("manufacturer_id")));
        manufactorer.selectByVisibleText("ACME Corp.");
        driver.findElement(By.name("keywords")).sendKeys("put in toy");
        driver.findElement(By.name("short_description[en]")).sendKeys("put in toy to play with bear and yellow duck");
    }
}
