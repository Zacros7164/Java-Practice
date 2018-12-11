package com.zaccrosby;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32 (binary?)

        //byte has a width of 8

        //auto converts math expressions into int, must cast to be in other data type

        // short has a width of 16

        //long has a width of 64
        byte myByteValue = 64;
        short myShortValue = 500;
        int myIntValue = 1_500_600;
        int mySum = myByteValue + myShortValue + myIntValue;
        long myLongValue = 50000 + 10 * mySum;
        System.out.println(myLongValue);
        // don't need to cast long because long will accept an int as an input

    }
}
