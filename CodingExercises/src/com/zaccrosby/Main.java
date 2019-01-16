package com.zaccrosby;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bark(true, 25);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int remainder = (kiloBytes % 1024);
            int megaBytes = (kiloBytes / 1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder+ " KB");

        }

    }

    public static boolean bark(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            barking = false;
        }else if(hourOfDay < 8 || hourOfDay > 22 && barking == true){
            return barking;
        }else if(barking == true && hourOfDay >= 8 && hourOfDay =< 22){
            barking = false;
        }
        return barking;

    }
}
