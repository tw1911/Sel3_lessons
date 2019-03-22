package ru.tw1911.sel3_lessons.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BaseShopPage {
    @FindBy(css = "div#box-product select[name='options[Size]']")
    WebElement sizeSelect;

    @FindBy(css = "button[name='add_cart_product']")
    WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean haveSize() {
        return isElementPresent(By.cssSelector("div#box-product select[name='options[Size]']"));
    }

    public void selectSize() {
        new Select(sizeSelect).selectByVisibleText("Small");
    }

    public void addToCart() {
        int oldCount = header.getProductInCartCount();
        addToCartButton.click();
        new WebDriverWait(driver,5).until(ExpectedConditions.textToBe(By.cssSelector("div#cart span.quantity"),String.valueOf(oldCount+1)));
    }
}
