package com.zaccrosby;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        // 7 digits after decimal
        double myDoubleValue = 5d / 3d;
        // 16 digits after decimal, more precise, default data type
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        int numPounds = 200;
        double kiloPerPound = 0.45359237;
        double kiloConv = numPounds * kiloPerPound;
        System.out.println("There are " + kiloConv + " kilos in " + numPounds + " pound(s).");
    }
}
