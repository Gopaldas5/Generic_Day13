package com.bridgeLabz;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericMaximumNumberTest {
    @Test
    void firstMaxNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        int max = GenericMaximumNumber.maxIntegerNumber(3, 6, 1);
        assertEquals(6,max);
    }
    @Test
    void secondMaxNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        int max = GenericMaximumNumber.maxIntegerNumber(7, 6, 10);
        assertEquals(7,max);
    }
    @Test
    void thirdMaxNumber(){
        GenericMaximumNumber tc = new GenericMaximumNumber();
        int max = GenericMaximumNumber.maxIntegerNumber(13, 16, 11);
        assertEquals(11,max);
    }

}