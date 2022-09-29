package com.learn_java;

import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        int p = 0;  // number of 0
        int n = 1;  // number of 1
        if (inputNumber == 0) {
            System.out.println("0");
            return;
        }
        System.out.println(0);
        System.out.println(1);
        if (inputNumber < 2) return;
        int c = 2;
        while (c < inputNumber) {
            int temp = p;
            p = n; // number of 1++
            n += temp; // number of 2++
            System.out.println(n);
            c++;
        }

    }
}
