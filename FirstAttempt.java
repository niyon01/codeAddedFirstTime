package com.learn_java;

import java.util.Scanner;

public class FirstAttempt {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Print your Name here : ");
        String name = scanner.nextLine();
        System.out.println("Enter Your Id :");
        int id = scanner.nextInt();
        findEachCharacter(name);
        findEachNumber(id);

    }

    private static void findEachNumber(int id) {

        String name = "";
        while(id>0) {
            int temp = id;
            temp = temp % 10;
            id = id / 10;
           name= name.concat(String.valueOf(temp));
        }
        name= reverse(name);
        findEachCharacter(String.valueOf(name));
    }

    private static String reverse(String name) {
        String num="";
        for(int i=name.length()-1;i>=0; i--){
            num= num.concat(String.valueOf(name.charAt(i)));
        }
        return num;
    }

    public static void findEachCharacter(String name) {

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + "  ");
        }
        System.out.println();
    }
}
