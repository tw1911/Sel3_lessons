package ru.tw1911.sel3_lessons.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    WebDriver driver;
    @FindBy(id = "site-menu")
    WebElement menuBar;

    @FindBy(css = "div#cart span.quantity")
    WebElement cartCounter;

    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement cartLink;

    public Header(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public int getProductInCartCount(){
        return Integer.parseInt(cartCounter.getText());
    }

    public void openCart() {
        cartLink.click();
    }
}
