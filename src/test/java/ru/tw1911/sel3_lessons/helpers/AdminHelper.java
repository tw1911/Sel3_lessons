package ru.tw1911.sel3_lessons.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.tw1911.sel3_lessons.config.TestSystemConfig;

public class AdminHelper {
    private WebDriver driver;

    public AdminHelper(WebDriver driver){
        this.driver = driver;
    }


    public void login(String login, String password) {
        driver.get(TestSystemConfig.baseUrl+"admin/login.php");
        driver.findElement(By.name("username")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("login")).click();
    }
}
