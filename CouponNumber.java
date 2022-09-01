package com.bridgelabz;

import java.util.Scanner;

public class CouponNumber {

    static String[] couponArray;

    public static void main(String[] args) {
        String str = "";

        System.out.println("Welcome to the Coupon Number Program!");
        System.out.println("This program will generate distinct Coupon Numbers.");
        System.out.print("\nEnter the number of Coupons to be generated : ");
        Scanner sc = new Scanner(System.in);
        int coupons = sc.nextInt();
        couponArray = new String[coupons];
        System.out.println();
        for(int counter = 0; counter < coupons; counter++) {
            str = generateCoupon();
            System.out.println("Coupon Number "+(counter+1)+" :	"+str);
        }
        sc.close();
    }

    static String generateCoupon() {
        String str = "";

        for(int counter = 0; counter <= 4; counter++) {
            int randomDigit = (int)(Math.random()*10);
            str = str + randomDigit;
        }
        String checkedDuplicacy = checkCoupons(str);

        return checkedDuplicacy;
    }

    static String checkCoupons(String newCoupon) {
        int check = 0;

        for(String existing : couponArray)
            if (newCoupon == existing)
                check++;
        if (check != 0)
            generateCoupon();

        return newCoupon;

    }
}
