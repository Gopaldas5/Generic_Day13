package com.bridgeLabz;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericMaximumNumberTest {
    @Test
    void firstMaxIntNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        int max = GenericMaximumNumber.maxIntegerNumber(3, 6, 1);
        assertEquals(6,max);
    }
    @Test
    void secondMaxIntNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        int max = GenericMaximumNumber.maxIntegerNumber(7, 6, 10);
        assertEquals(7,max);
    }
    @Test
    void thirdMaxIntNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        int max = GenericMaximumNumber.maxIntegerNumber(13, 16, 11);
        assertEquals(11,max);
    }
    @Test
    void firstMaxFloatFNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        Float max = GenericMaximumNumber.maxFloatNumber(1.3f, 1.6f, 1.1f);
        assertEquals(1.1f,max);
    }
    @Test
    void secondMaxFloatNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        Float max = GenericMaximumNumber.maxFloatNumber(1.3f, 1.6f, 1.1f);
        assertEquals(11,max);
    }
    @Test
    void thirdMaxFloatNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        float max = GenericMaximumNumber.maxFloatNumber(1.3f, 1.6f, 1.1f);
        assertEquals(11,max);
    }

}