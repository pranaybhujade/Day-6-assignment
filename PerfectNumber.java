package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 0;
        int sum =  0;

        System.out.println("Welcome to the Perfect Number Program!");
        System.out.println("This program checks whether the input number is a Perfect number or not.");
        System.out.print("\nEnter a number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        for(int i =  1; i< number; i++)
            if (number%i == 0)
                sum += i;

        if (sum == number)
            System.out.println("\n"+number+" is a  Perfect number.");
        else
            System.out.println("\n"+number+" is not a  Perfect number.");
        sc.close();
    }
}
