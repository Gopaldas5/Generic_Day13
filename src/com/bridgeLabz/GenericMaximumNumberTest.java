package com.bridgeLabz;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericMaximumNumberTest {
    @Test
    void firstMaxIntNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        int max = GenericMaximumNumber.maximum(3, 6, 1);
        assertEquals(6,max);
    }
    @Test
    void secondMaxIntNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        int max = GenericMaximumNumber.maximum(7, 6, 10);
        assertEquals(7,max);
    }
    @Test
    void thirdMaxIntNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        int max = GenericMaximumNumber.maximum(13, 16, 11);
        assertEquals(11,max);
    }
    @Test
    void firstMaxFloatFNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        Float max = GenericMaximumNumber.maximum(1.3f, 1.6f, 1.1f);
        assertEquals(1.1f,max);
    }
    @Test
    void secondMaxFloatNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        Float max = GenericMaximumNumber.maximum(1.3f, 1.6f, 1.1f);
        assertEquals(11,max);
    }
    @Test
    void firstMaxStringNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        String max = GenericMaximumNumber.maximum("apple", "pear", "orange");
        assertEquals(11,max);
    }
    @Test
    void secondMaxStringNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        String max = GenericMaximumNumber.maximum("ram", "rohan", "sita");
        assertEquals(11,max);
    }
    @Test
    void thirdMaxStringNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        String max = GenericMaximumNumber.maximum("bird", "animal", "human");
        assertEquals(11,max);
    }

}