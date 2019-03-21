package ru.tw1911.sel3_lessons;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.tw1911.sel3_lessons.config.TestSystemConfig;
import ru.tw1911.sel3_lessons.helpers.AdminHelper;


import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class LoginTest extends BasicTest{

    @Test
    public void firstTest(){
        adminHelper.login("admin","admin");
       // wait.until(titleIs("My Store"));
    }

}
