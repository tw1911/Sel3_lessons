package ru.tw1911.sel3_lessons;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.tw1911.sel3_lessons.app.Application;
import ru.tw1911.sel3_lessons.helpers.AdminHelper;
import ru.tw1911.sel3_lessons.helpers.NavigationHelper;

public abstract class BasicTest {
    protected AdminHelper adminHelper;
    protected NavigationHelper navigationHelper;

    public static ThreadLocal<Application> tlApp = new ThreadLocal<>();
    public Application app;


    @Before
    public void setUp(){
        if (tlApp.get() != null) {
            app = tlApp.get();
            return;
        }

        app = new Application();
        tlApp.set(app);

        //Runtime.getRuntime().addShutdownHook(
        //        new Thread(() -> { app.quit(); app = null; }));
    }
}
