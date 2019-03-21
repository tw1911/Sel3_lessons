package ru.tw1911.sel3_lessons.helpers;

import org.openqa.selenium.WebDriver;
import ru.tw1911.sel3_lessons.pages.AbstractShopPage;
import ru.tw1911.sel3_lessons.pages.MainShopPage;

public class NavigationHelper {
    WebDriver driver;

    public NavigationHelper(WebDriver driver){
        this.driver = driver;
    }

    public AbstractShopPage open(String pageTitle){
        switch (pageTitle){
            case "Главная страница": {return new MainShopPage(driver);}
            default:{return new MainShopPage(driver);}
        }
    }
}
