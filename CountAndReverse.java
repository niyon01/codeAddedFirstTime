package com.learn_java;

import java.util.Scanner;

public class CountAndReverse {

    public static void main(String[] args) {

        System.out.print("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tar = 4;
        countNumbers(num, tar);

    }

    private static void reverseNumbers(int par_Num) {

        int num = par_Num;
        int reverseNumbers = 0;
        while (num > 0) {
            int temp = num % 10;
            num = num / 10;
            reverseNumbers = reverseNumbers * 10 + temp;
        }
        System.out.println(reverseNumbers);
    }

    private static void countNumbers(int par_Num, int par_Tar) {
        int num = par_Num;
        int count = 0;
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == par_Tar) {
                count++;
            }
            num = num / 10;
            ans = ans * 10 + rem;
            System.out.print(rem + " ");
        }
        System.out.println(count);
        reverseNumbers(ans);
    }
}
