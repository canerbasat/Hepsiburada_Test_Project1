package com.saha.hepsiburada;


import org.junit.Test;

import static org.junit.Assert.*;

public class favoriTest extends Chrome {

    @Test // Test2
    public void favori() {
        try {
            new favori(driver).favori("canerbasatlol@hotmail.com", "123456caner");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}