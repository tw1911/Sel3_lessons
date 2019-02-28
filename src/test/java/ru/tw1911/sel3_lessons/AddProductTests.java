package ru.tw1911.sel3_lessons;

import org.junit.Test;
import org.openqa.selenium.By;

public class AddProductTests extends BasicTest{

    @Test
    public void addProductTest(){
        adminHelper.login("admin", "admin");
        adminHelper.clickMenuItem("Catalog");
        driver.findElement(By.xpath("//a[contains(text(),'Add New Product')]")).click();
    }
}
