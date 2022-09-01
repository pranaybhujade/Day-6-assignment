package com.bridgelabz;

import java.util.Scanner;

public class StopwatchSimulator {
    public static void main(String[] args) {
        char input = ' ';
        long start = 0;
        long end = 0;
        double timeElapsed = 0;


        System.out.println("Welcome to the Stopwatch Simulator Program!");
        System.out.println("This program will return the time elapsed between the start and the end of stopwatch.");
        System.out.print("\nEnter any character to START the stopwatch : ");
        Scanner sc=new Scanner(System.in);
        input = sc.next().charAt(0);
        start = System.currentTimeMillis();
        System.out.print("Enter any character to STOP the stopwatch : ");
        input = sc.next().charAt(0);
        end = System.currentTimeMillis();
        timeElapsed = (end-start)/1000;
        System.out.println("\nTime Elapsed : "+timeElapsed+"sec");
        sc.close();
    }
}
