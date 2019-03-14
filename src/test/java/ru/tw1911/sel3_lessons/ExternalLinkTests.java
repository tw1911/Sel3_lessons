package ru.tw1911.sel3_lessons;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.tw1911.sel3_lessons.BasicTest;

import java.util.List;

public class ExternalLinkTests extends BasicTest {

    @Test
    public void externalLinksTest(){
        adminHelper.login("admin","admin");
        adminHelper.clickMenuItem("Countries");
        driver.findElement(By.xpath("//a[contains(text(),'Add New Country')]")).click();
        List<WebElement> externalLinks = driver.findElements(By.cssSelector("form [target='_blank']"));
        externalLinks.forEach(webElement -> System.out.println(webElement.getAttribute("href")));
    }

}
