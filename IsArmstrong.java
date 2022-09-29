package com.learn_java;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        boolean is_Armstorng = isArmstrong(num);

        System.out.println(is_Armstorng);

    }

    private static boolean isArmstrong(int num) {
        int sum = 0;
        int n= num;
        while(n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem*rem*rem;
        }

        return sum== num;
    }
}
