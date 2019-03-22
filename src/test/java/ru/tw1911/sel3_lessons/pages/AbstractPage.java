package ru.tw1911.sel3_lessons.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    WebDriver driver;

    public AbstractPage(WebDriver driver){
        this.driver=driver;
    }

    public  <TPage extends AbstractPage> TPage getInstance (Class<TPage> pageClass) {
        try {
            //Initialize the Page with its elements and return it.
            return PageFactory.initElements(driver,  pageClass);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
