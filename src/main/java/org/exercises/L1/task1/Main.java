package org.exercises.L1.task1;

import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPalindrome(String.valueOf(num)));
    }
}
