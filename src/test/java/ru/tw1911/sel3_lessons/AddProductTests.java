package ru.tw1911.sel3_lessons;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.openqa.selenium.By;

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

    }
}
