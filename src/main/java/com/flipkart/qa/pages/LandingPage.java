package com.flipkart.qa.pages;

import com.flipkart.qa.base.TestBase;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class LandingPage extends TestBase {

    @FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
    WebElement flipkartLogo;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/button[1]")
    WebElement cancelLoginPopup;

    @FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
    WebElement searchBox;

    @FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")
    WebElement searchButton;

    @FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement selectProduct;

    @FindBy(xpath = "//div[@class='col col-11-12 _2cLjiM']")
    WebElement productDetails;

    @FindBy(xpath = "//span[contains(text(),'Size Chart')]")
    WebElement sizeChart;

    @FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[5]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
    WebElement largeSize;

    public LandingPage (WebDriver driver) throws AWTException{
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    Robot rb= new Robot();

    public boolean validateLogoIsPresent(){
        return flipkartLogo.isDisplayed();
    }

    public String validateLandingPageTitle() {
        return driver.getTitle();
    }
    public void cancelPopup() throws InterruptedException{
        cancelLoginPopup.isDisplayed();
        Thread.sleep(2000);
        cancelLoginPopup.click();
    }

    public boolean validateSearchBoxIsPresent(){
        return searchBox.isDisplayed();
    }

    public void validateSelectProduct() throws InterruptedException{
        selectProduct.isDisplayed();
        Thread.sleep(2000);
        selectProduct.click();
    }
    public void validateProductDetails() throws InterruptedException{
        productDetails.isDisplayed();
        Thread.sleep(2000);
        productDetails.click();
    }
    public void validateSizeChart() throws InterruptedException{
        sizeChart.isDisplayed();
        Thread.sleep(2000);
        sizeChart.click();
    }
    public void validateSize() throws InterruptedException{
        largeSize.isDisplayed();
        Thread.sleep(2000);
        largeSize.click();
    }

    public void enterSearchQuery(String searchText)throws InterruptedException{
        searchBox.sendKeys(searchText);
        searchButton.click();
    }

    public void clickProduct() throws InterruptedException{
        selectProduct.isDisplayed();
        Thread.sleep(2000);
        selectProduct.click();
    }

    public void clickProductDetails() throws InterruptedException{
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",productDetails);
        Thread.sleep(5000);
        productDetails.isDisplayed();
        Thread.sleep(5000);
        productDetails.click();
    }

    public void clickSizeChart() throws InterruptedException{
        sizeChart.isDisplayed();
        Thread.sleep(2000);
        sizeChart.click();
    }
    public void clickSize() throws InterruptedException{
        largeSize.isDisplayed();
        Thread.sleep(2000);
        largeSize.click();
    }


}
