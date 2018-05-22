package com.saha.hepsiburada;
import org.junit.Test;


public class GirisTest extends Chrome{



    @Test   //Test1un
    public void giris() {

        try {
            new Giris(driver).Giris("canerbasatlol@hotmail.com","123456caner");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}