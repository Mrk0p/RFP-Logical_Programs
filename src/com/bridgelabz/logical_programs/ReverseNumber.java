package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int reverse = 0;
        while (num !=0){

            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        System.out.println("Reversed number:"+reverse);

    }
}
