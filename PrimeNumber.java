package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 0;
        boolean prime = false;
        PrimeNumber objectp = new PrimeNumber();

        System.out.println("Welcome to the Prime Number Program!");
        System.out.println("This program checks whether the input number is Prime or not.");
        System.out.print("\nEnter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        prime = objectp.primeCheck(num);
        objectp.displayResult(num, prime);
        sc.close();
    }

    public boolean primeCheck(int number) {
        int check = 0;

        if(number%2 == 0 && number != 2)
            check++;
        else
            for(int i = 3; i < number;i=i+2)
                if (number%i == 0)
                    check++;

        return ((check == 0) ? true : false);
    }

    public void displayResult(int number, boolean result) {
        if (result)
            System.out.println("\n"+number+" is a Prime Number.");
        else
            System.out.println("\n"+number+" is not a Prime Number.");
    }
}
