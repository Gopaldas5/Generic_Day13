package com.bridgeLabz;

public class GenericMaximumNumber<T extends Comparable<T>> {
    public T num1, num2, num3;
    public GenericMaximumNumber(T num1, T num2, T num3) {
            this.num1 = num1;
            this.num2 = num2;
            this.num3 = num3;
        }
   public GenericMaximumNumber() {
        }

        public T maximum(T num1, T num2, T num3) {
            T max = num1;                     // assume num1 is initially the largest

            if (num2.compareTo(max) > 0)
                max = num2;                   // num2 is the largest so far
            if (num3.compareTo(max) > 0)
                max = num3;                  //num3 is the largest

            return max;                      //returns the largest object
        }
        public static void main (String[]args){

            System.out.println("Maximum of 3 numbers ");
            GenericMaximumNumber<Integer> integerObj = new GenericMaximumNumber<>();
            Integer maxInt = integerObj.maximum(3,4,5);
            System.out.printf("Maximum  Integer Number of %d, %d and %d is %d\n\n", 3, 4, 5, maxInt);

            GenericMaximumNumber<Float> floatObj = new GenericMaximumNumber<>();
            Float maxFloat = floatObj.maximum(3.3f, 4.4f, 5.5f);
            System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 3.3f, 4.4f, 5.5f, maxFloat);

            GenericMaximumNumber<String> stringObj = new GenericMaximumNumber<>();
            String maxString = stringObj.maximum("Pear", "Apple", "Orange");
            System.out.printf("Maximum of %s, %s and %s is %s\n", "Pear", "Apple", "Orange", maxString);
        }

}

