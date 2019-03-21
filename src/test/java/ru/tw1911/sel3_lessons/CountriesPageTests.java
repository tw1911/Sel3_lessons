package ru.tw1911.sel3_lessons;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CountriesPageTests extends BasicTest{
//
//    @Test
//    public void CheckCountriesOrderTest(){
//        adminHelper.login("admin","admin");
//        adminHelper.clickMenuItem("Countries");
//        List<String> countryList = getCountryRows()
//                .stream()
//                .map(row -> row.findElement(By.cssSelector("td:nth-child(5) > a")).getText())
//                .collect(Collectors.toList());
//
//        assertThat(countryList,isInAscendingOrdering());
//    }
//
//    @Test
//    public void CheckZonesForCountries(){
//        adminHelper.login("admin","admin");
//        adminHelper.clickMenuItem("Countries");
//        List<String> linksToCountriesWithZones = driver.findElements(By.xpath("//td[../td[6]/text()!='0'][5]/a"))
//                .stream()
//                .map(link -> link.getAttribute("href"))
//                .collect(Collectors.toList());
//
//        for(String link:linksToCountriesWithZones){
//            driver.get(link);
//            List<String> zones = driver.findElement(By.className("dataTable"))
//                    .findElements(By.xpath(".//tr[.//i]/td[3]"))
//                    .stream()
//                    .map(element ->element.getText())
//                    .collect(Collectors.toList());
//
//            assertThat(zones,isInAscendingOrdering());
//
//        }
//    }
//
//    @Test
//    public void CheckZonesOrder(){
//        adminHelper.login("admin","admin");
//        adminHelper.clickMenuItem("Geo Zones");
//        List<String> linksToCountriesWithZones = driver.findElement(By.className("dataTable"))
//                .findElements(By.cssSelector("td:nth-child(3) > a"))
//                .stream()
//                .map(link -> link.getAttribute("href"))
//                .collect(Collectors.toList());
//        linksToCountriesWithZones.forEach(zone -> System.out.println(zone));
//
//        for (String link:linksToCountriesWithZones){
//            driver.get(link);
//            List<String> zones = driver
//                    .findElements(By.cssSelector("table.dataTable td:nth-child(3) option[selected='selected']"))
//                    .stream().map(selected ->selected.getText()).collect(Collectors.toList());
//            zones.forEach(z-> System.out.println(z));
//            assertThat(zones,isInAscendingOrdering());
//        }
//    }
//
//    private List<WebElement> getCountryRows(){
//        return driver.findElements(By.cssSelector("tr.row"));
//    }
//
//    private Matcher<? super List<String>> isInAscendingOrdering()
//    {
//        return new TypeSafeMatcher<List<String>>()
//        {
//            @Override
//            public void describeTo (Description description)
//            {
//                description.appendText("describe the error has you like more");
//            }
//
//            @Override
//            protected boolean matchesSafely (List<String> items)
//            {
//                List<String> sorted = new ArrayList<>(items);
//                Collections.sort(sorted);
//                assertThat(items,is(sorted));
//                return true;
//            }
//        };
//    }

}
