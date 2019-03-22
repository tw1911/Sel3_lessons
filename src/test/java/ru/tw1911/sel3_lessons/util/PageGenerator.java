package ru.tw1911.sel3_lessons.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.tw1911.sel3_lessons.pages.AbstractPage;

public class PageGenerator {
    public WebDriver driver;

    public PageGenerator(WebDriver driver){
        this.driver = driver;
    }
}
