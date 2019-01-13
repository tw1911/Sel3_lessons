package ru.tw1911.sel3_lessons;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class AdminMenuTest extends BasicTest{

    @Test
    public void ClickAllMenyTest(){
        adminHelper.login("admin","admin");

        for (String itemName: getMenuItemsList()){
            //System.out.println(itemName);
            findItemByName(itemName).click();
            checkPageHeader();
            List<String> subItems = getSelectedItem().findElements(By.cssSelector("ul.docs > li span.name"))
                    .stream()
                    .map(element -> element.getText())
                    .collect(Collectors.toList());
            if(subItems!=null){
                //subItems.forEach(s -> System.out.println("\t"+s));
                for (String subItemName: subItems){
                    getSelectedItem().findElement(By.xpath(".//li[.//*[.='"+subItemName+"']]")).click();
                    checkPageHeader();
                }
            }
        }
    }

    private WebElement findItemByName(String name){
        return getMenuBox().findElement(By.xpath("./li[.//*[.='"+name+"']]"));
    }

    private List<String> getMenuItemsList(){
        return getMenuBox().findElements(By.id("app-"))
                .stream()
                .map(element -> element.findElement(By.className("name")).getText())
                .collect(Collectors.toList());
    }

    private WebElement getSelectedItem(){
        return getMenuBox().findElement(By.cssSelector("li#app-.selected"));
    }

    private WebElement getMenuBox(){
        return driver.findElement(By.id("box-apps-menu"));
    }

    private void checkPageHeader(){
        wait.until(driver -> driver.findElement(By.cssSelector("h1")));
    }
 }
