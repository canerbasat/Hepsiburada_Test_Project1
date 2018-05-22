package com.saha.hepsiburada;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;



public abstract class Chrome {
    WebDriver driver;

    @Before

    public void beforeChrome() {
        System.out.println("TEST BASLIYOR");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        System.setProperty("webdriver.chrome.driver","C:\\workspace\\hepsiburada\\driver\\chromedriver.exe");
        driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);

    }

    @After
    public void afterChrome () {


        System.out.println("TEST BASARILI");
        //driver.quit();


    }
}