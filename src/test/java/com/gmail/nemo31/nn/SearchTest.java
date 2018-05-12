package com.gmail.nemo31.nn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {


    public static MainPage mainPage;
    public static SearchResultPage searchResultPage;

    @BeforeClass
    protected void initialize() {
        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @Test
    public void searching(){
        WebElement element = driver.findElement(By.id("orb-search-q"));
        (new WebDriverWait(driver,10)).until(ExpectedConditions.visibilityOf(element));
        mainPage.searchInput("telegram");
        mainPage.clickSearchButton();
        searchResultPage.clickFirstSearchResult();
    }



}
