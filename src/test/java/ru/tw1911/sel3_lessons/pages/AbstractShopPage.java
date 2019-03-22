package ru.tw1911.sel3_lessons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.tw1911.sel3_lessons.pages.elements.Header;

public class AbstractShopPage  extends AbstractPage{
    public final Header header;

    public AbstractShopPage(WebDriver driver){
        super(driver);
        this.header = new Header(driver);
    }

    protected boolean isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }

    protected CartPage cart(){
        header.openCart();
        return getInstance(CartPage.class);
    }
}
