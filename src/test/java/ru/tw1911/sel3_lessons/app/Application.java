package ru.tw1911.sel3_lessons.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.tw1911.sel3_lessons.pages.MainShopPage;
import ru.tw1911.sel3_lessons.pages.ProductPage;

public class Application {
    private WebDriver driver;
    MainShopPage mainShopPage;
    ProductPage productPage;

    public Application() {
        driver = new ChromeDriver();
        mainShopPage = new MainShopPage(driver);
        productPage = new ProductPage(driver);
    }

    public void quit() {
        driver.quit();
    }

    public void addProductToCart() {
        mainShopPage.open();
        productPage = mainShopPage.openProduct();
        if(productPage.haveSize()){
            productPage.selectSize();
        }
        productPage.addToCart();
    }
}
