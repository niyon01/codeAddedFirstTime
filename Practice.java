package com.learn_java;

public class Practice {
    public static void main(String[] args) {

        String str = "dabcdcbad";
        int left = 0;
        int right = str.length() - 1;
        boolean isPanidrome = true;
        while (left <= right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
                continue;
            } else {
                isPanidrome= false;
                break;
            }
        }
        if (isPanidrome) {
            System.out.println("yes");
        } else System.out.println("no");
    }
}