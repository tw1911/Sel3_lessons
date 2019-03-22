package ru.tw1911.sel3_lessons.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.tw1911.sel3_lessons.pages.CartPage;
import ru.tw1911.sel3_lessons.pages.MainShopPage;
import ru.tw1911.sel3_lessons.pages.ProductPage;
import ru.tw1911.sel3_lessons.util.PageGenerator;

public class Application {
    private WebDriver driver;
    PageGenerator pageGenerator;

    public Application() {
        driver = new ChromeDriver();
        pageGenerator = new PageGenerator(driver);
    }

    public void quit() {
        driver.quit();
    }

    public void addProductToCart() {
        ProductPage product = pageGenerator.GetInstance(MainShopPage.class)
                .open()
                .openProduct();
        if(product.haveSize()){
            product.selectSize();
        }
        product.addToCart();
    }

    public void clearCart() {
        CartPage cartPage = this.getInstance(MainShopPage.class)
                .open()
                .header.openCart();
        mainShopPage.header.openCart();
        while (cartPage.itemsCount()>0){
            cartPage.removeCurrentItem();
        }
    }


}
