package ru.tw1911.sel3_lessons;

import org.junit.Before;
import ru.tw1911.sel3_lessons.app.Application;
import ru.tw1911.sel3_lessons.helpers.AdminHelper;

public abstract class BasicTest {
    protected AdminHelper adminHelper;

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
