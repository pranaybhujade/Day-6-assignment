package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int originalNumber = 0;
        int quotient = 0;
        int mod = 0;
        int reverseNumber = 0;

        System.out.println("Welcome to Reverse Number Program!");
        System.out.println("This program will reverse the number you enter.");
        System.out.print("\nEnter a number : ");
        Scanner sc = new Scanner(System.in);
        originalNumber = sc.nextInt();

        quotient = originalNumber;
        while(quotient != 0) {
            mod = quotient%10;
            reverseNumber = (reverseNumber*10)+mod;
            quotient = quotient/10;
        }

        System.out.println();
        System.out.println("Result after Reversal");
        System.out.println("Original Number :	"+originalNumber);
        System.out.println("Reverse Number :	"+reverseNumber);
    }
}
