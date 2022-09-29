package com.learn_java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter Your Number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        fibonacci(number);

    }

    private static void fibonacci(int number) {
        int p = 0;
        int i = 1;

        if(number == 0){
            System.out.println(p);
            return ;
        }else if(number == 1){
            System.out.println(p);
            System.out.println(i);
            return ;
        }else{
            System.out.println(p);
            System.out.println(i);
        }

        int count =2;
        while (count<=number) {
            int temp = p;
            p = i ;
            i = temp + i;
            System.out.println(i);
            count = count + 1;

        }

    }
}
