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

    @Test
    public void CheckCountriesOrderTest(){
        adminHelper.login("admin","admin");
        adminHelper.clickMenuItem("Countries");
        List<String> countryList = getCountryRows()
                .stream()
                .map(row -> row.findElement(By.cssSelector("td:nth-child(5) > a")).getText())
                .collect(Collectors.toList());
        List<String> sortedCountryList = new ArrayList<>(countryList);
        Collections.sort(sortedCountryList);

        assertThat(countryList,is(sortedCountryList));
    }

    @Test
    public void CheckZonesForCountries(){
        adminHelper.login("admin","admin");
        adminHelper.clickMenuItem("Countries");
        List<String> linksToCountriesWithZones = driver.findElements(By.xpath("//td[../td[6]/text()!='0'][5]/a"))
                .stream()
                .map(link -> link.getAttribute("href"))
                .collect(Collectors.toList());

        for(String link:linksToCountriesWithZones){
            driver.get(link);
            List<String> zones = driver.findElement(By.className("dataTable"))
                    .findElements(By.xpath(".//tr[.//i]/td[3]"))
                    .stream()
                    .map(element ->element.getText())
                    .collect(Collectors.toList());

            List<String> zonesSorted = new ArrayList<>(zones);
            Collections.sort(zonesSorted);
            assertThat(zones,is(zonesSorted));

        }
    }

    @Test
    public void CheckZonesOrder(){

    }

    private List<WebElement> getCountryRows(){
        return driver.findElements(By.cssSelector("tr.row"));
    }

}
