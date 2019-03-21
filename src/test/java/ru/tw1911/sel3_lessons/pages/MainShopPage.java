package ru.tw1911.sel3_lessons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import ru.tw1911.sel3_lessons.config.TestSystemConfig;
import ru.tw1911.sel3_lessons.pages.elements.Header;

public class MainShopPage extends AbstractShopPage {

    @FindBy(css = "div#box-most-popular li.product:first-of-type")
    private WebElement randomMostPopularProduct;

    public MainShopPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public MainShopPage open() {
        driver.get(TestSystemConfig.baseUrl);
        return this;
    }


    public ProductPage openProduct(){
        randomMostPopularProduct.click();
        return new ProductPage(driver);
    }
}
