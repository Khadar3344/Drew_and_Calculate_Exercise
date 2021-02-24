package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        printLadder(7);

        System.out.println();

        average();
    }

    private static void average() {

        int[] Arr = {19,69,80,74,34};
        float sum = 0;
        for (int s = 0; s < Arr.length; s++) {
            System.out.println("the value [" + (s + 1) + "] is: "+ Arr[s]);
            sum += Arr[s];
        }
        double avg = sum / Arr.length;
        System.out.println("the average is "+avg);

    }

    private static void printLadder(int i) {
        for (int j = 1; j <= i ; j++) {
            for (int k = 1; k <= i-j; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * j - 1); l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
