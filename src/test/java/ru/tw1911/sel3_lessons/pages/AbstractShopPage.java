package ru.tw1911.sel3_lessons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.tw1911.sel3_lessons.pages.elements.Header;

public class AbstractShopPage {
    WebDriver driver;
    Header header;

    public AbstractShopPage(WebDriver driver){
        this.driver = driver;
        this.header = new Header(driver);
    }

    protected boolean isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }
}
