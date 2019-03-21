package ru.tw1911.sel3_lessons;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import ru.tw1911.sel3_lessons.config.TestSystemConfig;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class ProductItemsTests extends BasicTest{

/*
    @Before
    public void setUp(){
        super.setUp();
        driver.get(TestSystemConfig.baseUrl);
    }

    @Test
    public void checkProductAttributesOnMainPage(){
        WebElement productBox = getFirstCompaignItem();
        WebElement regilarPrice =  productBox.findElement(By.className("regular-price"));
        WebElement campaignPrice = productBox.findElement(By.className("campaign-price"));


        //проверяем что обычная цена - зачеркнутая
        assertTrue(regilarPrice.getCssValue("text-decoration").contains("line-through"));
        //проверяем что обычная цена серая.
        assertThat(Color.fromString(regilarPrice.getCssValue("color")),isGrayColor());


        //проверяем что акционная цена "жирная"
        assertTrue(isBold(campaignPrice.getCssValue("font-weight")));

        //проверяем что акционная цена красная
        assertThat(Color.fromString(campaignPrice.getCssValue("color")),isRedColor());

        //проверяем что шрифт по акции больше шрифта обычной цены
        assertTrue(parseFontSize(campaignPrice.getCssValue("font-size"))>parseFontSize(regilarPrice.getCssValue("font-size")));
    }

    @Test
    public void checkProductAttributesOnProductPage(){
        getFirstCompaignItem().click();
        wait.until(driver -> driver.findElement(By.className("box")));
        WebElement productBox = driver.findElement(By.id("box-product"));
        WebElement regilarPrice =  productBox.findElement(By.className("regular-price"));
        WebElement campaignPrice = productBox.findElement(By.className("campaign-price"));

        //проверяем что обычная цена - зачеркнутая
        assertTrue(regilarPrice.getCssValue("text-decoration").contains("line-through"));
        //проверяем что обычная цена серая.
        assertThat(Color.fromString(regilarPrice.getCssValue("color")),isGrayColor());

        //проверяем что акционная цена "жирная"
        assertTrue(isBold(campaignPrice.getCssValue("font-weight")));

        //проверяем что акционная цена красная
        assertThat(Color.fromString(campaignPrice.getCssValue("color")),isRedColor());

        //проверяем что шрифт по акции больше шрифта обычной цены
        assertTrue(parseFontSize(campaignPrice.getCssValue("font-size"))>parseFontSize(regilarPrice.getCssValue("font-size")));

    }

    @Test
    public void checkPriceTest(){
        WebElement productBox = getFirstCompaignItem();
        String mainPageProductName = productBox.findElement(By.className("name")).getText();
        productBox.click();
        String productPageProductName = driver.findElement(By.cssSelector("#box-product h1.title")).getText();
        assertThat(mainPageProductName,equalTo(productPageProductName));
    }

    @Test
    public void checkNameTest(){
        WebElement mainPageProductBox = getFirstCompaignItem();
        String mainPageRegilarPrice =  mainPageProductBox.findElement(By.className("regular-price")).getText();
        String mainPageCampaignPrice = mainPageProductBox.findElement(By.className("campaign-price")).getText();
        mainPageProductBox.click();
        WebElement productPageProductBox = driver.findElement(By.id("box-product"));
        String productPageRegilarPrice =  productPageProductBox.findElement(By.className("regular-price")).getText();
        String productPageCampaignPrice = productPageProductBox.findElement(By.className("campaign-price")).getText();

        assertThat(mainPageRegilarPrice,equalTo(productPageRegilarPrice));
        assertThat(mainPageCampaignPrice,equalTo(productPageCampaignPrice));
    }

    private WebElement getFirstCompaignItem(){
        return driver.findElement(By.cssSelector("div#box-campaigns li.product:first-child"));
    }

    private double parseFontSize(String fontSize){
        return Double.parseDouble(fontSize.substring(0,fontSize.length()-2));
    }

    private boolean isBold(String fontWeight){
        return "bold".equals(fontWeight) || "bolder".equals(fontWeight) || Integer.parseInt(fontWeight) >= 700;
    }

    private Matcher<Color> isGrayColor()
    {
        return new TypeSafeMatcher<Color>()
        {
            @Override
            public void describeTo (Description description)
            {
                description.appendText("describe the error has you like more");
            }

            @Override
            protected boolean matchesSafely (Color color)
            {

                return color.getColor().getBlue()==color.getColor().getGreen() &&
                        color.getColor().getBlue()==color.getColor().getRed() &&
                        color.getColor().getBlue()==color.getColor().getRed();
            }
        };
    }
    private Matcher<Color> isRedColor()
    {
        return new TypeSafeMatcher<Color>()
        {
            @Override
            public void describeTo (Description description)
            {
                description.appendText("describe the error has you like more");
            }

            @Override
            protected boolean matchesSafely (Color color)
            {

                return color.getColor().getBlue()==0 &&
                        color.getColor().getGreen()==0 &&
                        color.getColor().getRed()>0;
            }
        };
    }*/

}
