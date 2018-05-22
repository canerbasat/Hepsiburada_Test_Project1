package com.saha.hepsiburada;

import org.junit.Assert;
import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class Giris extends toolset {

    public Giris(WebDriver driver) {
        super(driver);
    }

    public void Giris(String email, String password) throws InterruptedException {
        driver.get("https://www.hepsiburada.com.tr");

        driver.findElement(By.cssSelector(".insider-opt-in-notification-button.insider-opt-in-disallow-button")).click();


        driver.findElement(By.id("myAccount")).click();
        System.out.println("1.Giriş Yap butonuna basıldı.");
        Thread.sleep(1500);


        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        System.out.println("2.Email ve şifre girildi.");

        driver.findElement(By.cssSelector(".btn.full.btn-login-submit")).click();
        System.out.println("3.Giriş Yapıldı.");


        WebElement el = driver.findElement(By.id("productSearch"));
        el.sendKeys("İf Dizayn TV Test Ekranı Tasarım Anahtarlık");
        driver.findElement(By.id("buttonProductSearch")).click();
        System.out.println("4.Ürün araması yapıldı.");


        driver.findElement(By.cssSelector(".hb-pl-cn")).click();
        System.out.println("5.Ürüne Girildi.");

        String urunFiyatı = driver.findElement(By.id("offering-price")).getText();
        System.out.println("6.Ürün fiyatı alındı");


        driver.findElement(By.id("addToCart")).click();
        System.out.println("7.Sepete eklendi");


        List<WebElement> sepetFiyatı = driver.findElements(By.cssSelector(".total-price"));
        String sepetFiyatıString = sepetFiyatı.get(0).getText();
        Assert.assertEquals("Eşleşmeyen fiyat", urunFiyatı, sepetFiyatıString);
        System.out.println("8.Sepetteki Fiyat alındı ve karşılaştırıldı");
        System.out.println("\tÜrün fiyatı\t" + urunFiyatı + "\n\tSepet Fiyatı\t" + sepetFiyatıString);


        driver.findElement(By.cssSelector(".btn.btn-primary.full")).click();
        System.out.println("9.Alışverişi tamamla.");

        WebElement isimBox = driver.findElement(By.id("first-name"));
        isimBox.sendKeys("Caner");

        WebElement soyisimBox = driver.findElement(By.id("last-name"));
        soyisimBox.sendKeys("Başat");

        List<WebElement> dropdownMenus = driver.findElements(By.cssSelector(".btn.dropdown-toggle.selectpicker.btn-default"));
        dropdownMenus.get(0).click();
        driver.findElements(By.xpath("//span[contains(@class,'text')]  [contains(text(),'Türkiye')]"));


        dropdownMenus = driver.findElements(By.cssSelector(".btn.dropdown-toggle.selectpicker.btn-default"));
        dropdownMenus.get(1).click();
        driver.findElements(By.xpath("//span[contains(@class,'text')]  [contains(text(),'İstanbul')]"));


        dropdownMenus = driver.findElements(By.cssSelector(".btn.dropdown-toggle.selectpicker.btn-default"));
        dropdownMenus.get(2).click();
        driver.findElement(By.xpath("//span[contains(@class,'text')]  [contains(text(),'GÜNGÖREN')]")).click();

        Thread.sleep(3000);

        dropdownMenus = driver.findElements(By.cssSelector(".btn.dropdown-toggle.selectpicker.btn-default"));
        dropdownMenus.get(3).click();
        driver.findElement(By.xpath("//span[contains(@class,'text')]  [contains(text(),'GÜNEŞTEPE')]")).click();

        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(Keys.PAGE_DOWN);

        WebElement adressBox = driver.findElement(By.id("address"));

        adressBox.sendKeys("Güngören Günestepe mahallesi , bingöl sokak");

        WebElement adressnameBox = driver.findElement(By.id("address-name"));
        adressnameBox.sendKeys("Ev Adresim");

        WebElement phoneBox = driver.findElement(By.id("phone"));
        phoneBox.sendKeys("5344585220");
        System.out.println("10.Teslimat bilgileri girildi");

        //driver.findElement(By.cssSelector(".btn.btn-primary.full")).click();

    }


}