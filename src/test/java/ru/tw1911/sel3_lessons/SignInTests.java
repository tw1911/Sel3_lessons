package ru.tw1911.sel3_lessons;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ru.tw1911.sel3_lessons.BasicTest;
import ru.tw1911.sel3_lessons.config.TestSystemConfig;
import ru.tw1911.sel3_lessons.entity.Address;
import ru.tw1911.sel3_lessons.entity.User;

import java.util.Random;

public class SignInTests extends BasicTest {

    User user;

    @Before
    public void prapareData(){
        this.user = new User()
                .firstName("Ivan")
                .lastName("Ivanov")
                .phone(getValidPhone())
                .email(getValidEmail())
                .address(new Address()
                        .address("GGGGGGggg 11")
                        .postcode("33445")
                        .country("United States")
                        .city("Socity"));
    }

    @Test
    public void signInTest(){
        driver.get(TestSystemConfig.baseUrl);
        driver.findElement(By.xpath("//a[text()='New customers click here']")).click();
        fillSignInForm(user);
        logOut();

    }

    private void fillSignInForm(User user){
        driver.findElement(By.name("firstname")).sendKeys(user.firstName());
        driver.findElement(By.name("lastname")).sendKeys(user.lastName());
        driver.findElement(By.name("address1")).sendKeys(user.address().address());
        driver.findElement(By.name("postcode")).sendKeys(user.address().postcode());
        driver.findElement(By.name("city")).sendKeys(user.address().city());
        driver.findElement(By.xpath("//td[contains(text(),'Country')]/span/span")).click();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(user.address().country());
        driver.findElement(By.xpath("//li[text()='"+user.address().country()+"']")).click();
        driver.findElement(By.name("email")).sendKeys(user.email());
        driver.findElement(By.name("phone")).sendKeys(user.phone());
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.name("confirmed_password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Create Account']")).click();

    }

    private String getValidEmail(){
        return RandomStringUtils.randomAlphabetic(10)+
                "@"+RandomStringUtils.randomAlphabetic(10)+
                "."+RandomStringUtils.randomAlphabetic(3);
    }

    private String getValidPhone(){
        return RandomStringUtils.randomNumeric(8);
    }

    private void logOut(){
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }
}