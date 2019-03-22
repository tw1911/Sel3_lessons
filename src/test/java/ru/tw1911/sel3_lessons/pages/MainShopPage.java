package ru.tw1911.sel3_lessons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.tw1911.sel3_lessons.config.TestSystemConfig;

public class MainShopPage extends BaseShopPage {

    @FindBy(css = "div#box-most-popular li.product:first-of-type")
    private WebElement randomMostPopularProduct;

    public MainShopPage(WebDriver driver){
        super(driver);
    }

    public MainShopPage open() {
        driver.get(TestSystemConfig.baseUrl);
        return this;
    }

    public ProductPage openProduct(){
        randomMostPopularProduct.click();
        return getInstance(ProductPage.class);
    }
}
