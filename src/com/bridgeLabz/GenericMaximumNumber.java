package com.bridgeLabz;

public class GenericMaximumNumber {
    public static int maxIntegerNumber(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;             // assume num1 is initially the largest

        if (num2.compareTo(max) > 0)
            max = num2;                 // num2 is the largest so far
        if (num3.compareTo(max) > 0)
            max = num3;                //num3 is the largest

        return max;                    //returns the largest object
    }

    public static void main(String[] args) {

        System.out.println("Maximum of 3 numbers ");
        System.out.printf("Maximum  Integer Number of %d, %d and %d is %d\n\n",3,4,5,maxIntegerNumber(3, 4, 5));

    }
}
