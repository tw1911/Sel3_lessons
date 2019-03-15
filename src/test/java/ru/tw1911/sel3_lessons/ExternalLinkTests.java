package ru.tw1911.sel3_lessons;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class ExternalLinkTests extends BasicTest {

    @Test
    public void externalLinksTest(){
        adminHelper.login("admin","admin");
        adminHelper.clickMenuItem("Countries");
        driver.findElement(By.xpath("//a[contains(text(),'Add New Country')]")).click();
        List<WebElement> externalLinks = driver.findElements(By.cssSelector("form [target='_blank']"));
        externalLinks.forEach(webElement -> System.out.println(webElement.getAttribute("href")));
        for(WebElement link: externalLinks){
            String mainWindow = driver.getWindowHandle();
            Set<String> oldWindows = driver.getWindowHandles();
            link.click(); // открывает новое окно
            String newWindow = wait.until(webDriver -> {
                Set<String> newWindows = webDriver.getWindowHandles();
                newWindows.removeAll(oldWindows);
                return newWindows.iterator().next();
            });
            driver.switchTo().window(newWindow);
            driver.close();
            driver.switchTo().window(mainWindow);
        }
    }
}
