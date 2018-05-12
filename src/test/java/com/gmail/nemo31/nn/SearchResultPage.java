package com.gmail.nemo31.nn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(css = "li[data-result-number='1'] a:nth-child(1)")
    public WebElement firstSearchResult;

    public void clickFirstSearchResult(){
        firstSearchResult.click();
    }
}
