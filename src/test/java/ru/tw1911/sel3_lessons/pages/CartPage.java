package ru.tw1911.sel3_lessons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage extends AbstractShopPage {

    @FindBy(css = ".dataTable tr:not([class]) td.item")
    List<WebElement> cardItems;

    @FindBy(css = "button[name='remove_cart_item']")
    WebElement removeProductButton;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void removeCurrentItem(){
        int tableSize = cardItems.size();
        removeProductButton.click();
        new WebDriverWait(driver,10).until(webDriver -> cardItems.size() == tableSize-1);
    }

    public int itemsCount(){
        return cardItems.size();
    }
}
