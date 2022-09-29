package com.learn_java;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPrime(num));
    }

    private static boolean isPrime(int i) {
        if (i < 2) return false;
        int c =2;
        while (c*c<=i) {
            if (c%2==0) return false;
            c++;
        }
      return true;

    }
}
