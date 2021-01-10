package com.flipkart.qa.TestCase;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.net.MalformedURLException;

public class LandingPageTest extends TestBase {
    LandingPage landingPage;

    public LandingPageTest(){ super();}

    @BeforeClass
    public void setUp() throws MalformedURLException, AWTException{
        initialization();
        landingPage = new LandingPage(driver);
    }

    @Test(priority = 1)
    public void landingPageTitleTest() throws InterruptedException{
        Thread.sleep(2000);
        landingPage.cancelPopup();
        String title=landingPage.validateLandingPageTitle();
        Assert.assertEquals(title,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
    }

    @Test(priority = 2)
    public void searchBoxTest(){
        boolean flag= landingPage.validateSearchBoxIsPresent();
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    public void searchTextTestAndVerifySame() throws InterruptedException{
        landingPage.enterSearchQuery("Solid Men Round Neck Blue, Grey T-Shirt");
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void selectSecondProduct() throws InterruptedException{
        landingPage.clickProduct();
        Thread.sleep(4000);
        landingPage.validateSelectProduct();
    }
    @Test(priority = 5)
    public void selectProductDetails() throws InterruptedException{
        landingPage.clickProductDetails();
        Thread.sleep(5000);
        landingPage.validateProductDetails();
    }
    @Test(priority = 6)
    public void selectSizeChart() throws InterruptedException{
        landingPage.clickSizeChart();
        Thread.sleep(2000);
        landingPage.validateSizeChart();
    }
    @Test(priority = 7)
    public void selectLargeSize() throws InterruptedException{
        landingPage.clickSize();
        Thread.sleep(2000);
        landingPage.validateSize();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
