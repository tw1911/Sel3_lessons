package ru.tw1911.sel3_lessons;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.tw1911.sel3_lessons.helpers.AdminHelper;

public abstract class BasicTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected AdminHelper adminHelper;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        adminHelper=new AdminHelper(driver);
    }

    @After
    public void tearDown(){
        driver.close();
        driver=null;
    }
}
