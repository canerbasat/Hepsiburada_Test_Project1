package com.saha.hepsiburada;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class favori extends toolset {

    public favori(WebDriver driver) {

        super(driver)
        ;
    }

    public void favori(String email, String password) throws InterruptedException {
        driver.get("https://www.hepsiburada.com.tr");

        driver.findElement(By.cssSelector(".insider-opt-in-notification-button.insider-opt-in-disallow-button")).click();


        driver.findElement(By.id("myAccount")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector(".btn.full.btn-login-submit")).click();
        System.out.println("1.Giriş Yapıldı.");

        WebElement el = driver.findElement(By.id("productSearch"));
        el.sendKeys("İf Dizayn TV Test Ekranı Tasarım Anahtarlık");
        driver.findElement(By.id("buttonProductSearch")).click();
        System.out.println("2.Ürün arandı.");

        driver.findElement(By.cssSelector(".hb-pl-cn")).click();
        System.out.println("3.Ürüne girildi.");


        String urunİsmi = driver.findElement(By.id("product-name")).getText();
        System.out.println("4.Ürün ismi alındı :\t" + urunİsmi);

        WebElement favocompare = driver.findElement(By.cssSelector("li.favorite > a"));
        favocompare.click();
        System.out.println("5.Listeye eklendi.");

        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#notification > div.popup > a.goToMyFavoriteList")).click();
        System.out.println("6.Favori Listesine gidildi.");

        String favlistText = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rptShoppingList_ctl01_hplProductName")).getText();
        System.out.println("Favori listesindeki ismi: \t" + favlistText);
        Assert.assertEquals("Eslesmeyen isim :", urunİsmi, favlistText);
        System.out.println("7.Ürünler karşılaştırıldı \n\tÜrün İsimleri Aynı.");


        driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnDeleteAll")).click();
        Thread.sleep(1200);

        driver.switchTo().alert().accept();

        System.out.println("8.Liste Boşaltıldı.");

    }
}