package ru.tw1911.sel3_lessons.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.tw1911.sel3_lessons.config.TestSystemConfig;

import java.util.List;
import java.util.stream.Collectors;

public class AdminHelper {
    private WebDriver driver;
    private WebDriverWait wait;

    public AdminHelper(WebDriver driver){
        this.driver = driver;this.wait= new WebDriverWait(this.driver,10);
    }


    public void login(String login, String password) {
        driver.get(TestSystemConfig.baseUrl+"admin/login.php");
        driver.findElement(By.name("username")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("login")).click();
    }

    public WebElement findItemByName(String name){
        return getMenuBox().findElement(By.xpath("./li[.//*[.='"+name+"']]"));
    }

    public List<String> getMenuItemsList(){
        return getMenuBox().findElements(By.id("app-"))
                .stream()
                .map(element -> element.findElement(By.className("name")).getText())
                .collect(Collectors.toList());
    }

    public WebElement getSelectedItem(){
        return getMenuBox().findElement(By.cssSelector("li#app-.selected"));
    }

    private WebElement getMenuBox(){
        return driver.findElement(By.id("box-apps-menu"));
    }

    public void checkPageHeader(){
        wait.until(driver -> driver.findElement(By.cssSelector("h1")));
    }
}
