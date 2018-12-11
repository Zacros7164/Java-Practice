package com.zaccrosby;

public class Main {

    public static void main(String[] args) {
	    int newValue = 50;
	    if(newValue == 50)
            System.out.println("This is true");

	    boolean isCar = false;
	    if(isCar == true)
            System.out.println("This is not supposed to happen");
        isCar = true;
	    boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");


        double myDouble = 20;
        double mySecondDouble = 80;
        double result = (myDouble + mySecondDouble) * 25;
        System.out.println("my result is " + result);
        double sum = result % 40;
        if(sum <= 20)
            System.out.println("Total was over the limit");


    }
}
