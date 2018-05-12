package com.gmail.nemo31.nn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy (id = "orb-search-q")
    public WebElement searchField;

    @FindBy (id = "orb-search-button")
    public WebElement searchButton;

    public void searchInput(String searchText){
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton(){
        searchButton.click();
    }



}
