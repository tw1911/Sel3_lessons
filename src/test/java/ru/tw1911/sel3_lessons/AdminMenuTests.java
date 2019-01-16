package ru.tw1911.sel3_lessons;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class AdminMenuTests extends BasicTest{


    @Test
    public void ClickAllMenyTest(){
        adminHelper.login("admin","admin");

        for (String itemName: adminHelper.getMenuItemsList()){
            //System.out.println(itemName);
            adminHelper.findItemByName(itemName).click();
            adminHelper.checkPageHeader();
            List<String> subItems = adminHelper.getSelectedItem().findElements(By.cssSelector("ul.docs > li span.name"))
                    .stream()
                    .map(element -> element.getText())
                    .collect(Collectors.toList());
            if(subItems!=null){
                //subItems.forEach(s -> System.out.println("\t"+s));
                for (String subItemName: subItems){
                    adminHelper.getSelectedItem().findElement(By.xpath(".//li[.//*[.='"+subItemName+"']]")).click();
                    adminHelper.checkPageHeader();
                }
            }
        }
    }


 }
