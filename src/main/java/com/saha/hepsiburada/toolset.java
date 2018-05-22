package com.saha.hepsiburada;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class toolset{
    WebDriver driver;
    WebDriverWait driverWait;


    public toolset(WebDriver driver)
    {
        this.driver = driver;
        this.driverWait= new WebDriverWait(driver,5,150);
    }


  /* public void clickById(String objectId,String HataMesaji){
        driverWait.withMessage(HataMesaji);
        driverWait.until(ExpectedConditions.elementToBeClickable(By.id(objectId))).isDisplayed();
        driver.findElement(By.id(objectId)).click();
    }
    */


}