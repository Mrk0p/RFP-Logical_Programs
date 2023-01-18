package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {

            if (num % i == 0)
                sum = sum + i;

        }
        if (sum == num) {
            System.out.println(num + " is Perfect Number");
        } else {
            System.out.println(num + " is Not Perfect Number");
        }
    }
}
