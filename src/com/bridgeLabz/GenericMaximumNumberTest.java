package com.bridgeLabz;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericMaximumNumberTest {
    GenericMaximumNumber<Integer> intObj = new GenericMaximumNumber();
    GenericMaximumNumber<Float> floatObj = new GenericMaximumNumber();
    GenericMaximumNumber<String> stringObj = new GenericMaximumNumber();

    @Test
    void firstMaxIntNumber(){
        int maxInt = intObj.maximum(3, 6, 1);
        assertEquals(6,maxInt);
    }
    @Test
    void secondMaxIntNumber(){

        int maxInt = intObj.maximum(7, 6, 10);
        assertEquals(7,maxInt);
    }
    @Test
    void thirdMaxIntNumber(){
        int maxInt = intObj.maximum(13, 16, 11);
        assertEquals(11,maxInt);
    }
    @Test
    void firstMaxFloatFNumber(){
        Float maxInt = floatObj.maximum(1.3f, 1.6f, 1.1f);
        assertEquals(1.6f,maxInt);
    }
    @Test
    void secondMaxFloatNumber(){
        Float maxFloat = floatObj.maximum(1.3f, 1.6f, 1.1f);
        assertEquals(1.3f,maxFloat);
    }
    @Test
    void thirdMaxFloatNumber() {
        Float maxFloat = floatObj.maximum(11.3f, 21.6f, 13.1f);
        assertEquals(21.6f, maxFloat);
    }
    @Test
    void firstMaxStringNumber(){
        String maxString = stringObj.maximum("apple", "pear", "orange");
        assertEquals("pear",maxString);
    }
    @Test
    void secondMaxStringNumber(){
        String maxString = stringObj.maximum("ram", "rohan", "sita");
        assertEquals("sita",maxString);
    }
    @Test
    void thirdMaxStringNumber(){
        String maxString = stringObj.maximum("bird", "animal", "human");
        assertEquals("animal",maxString);
    }

}