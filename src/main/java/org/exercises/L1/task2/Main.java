package org.exercises.L1.task2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Character getMatchingPair(char c) {
        return switch (c) {
            case '(' -> ')';
            case ')' -> '(';
            case '[' -> ']';
            case ']' -> '[';
            case '{' -> '}';
            case '}' -> '{';
            default -> null;
        };
    }

    public static boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char cur = s.charAt(i);

            if (cur == '(' || cur == '[' || cur == '{') {
                stack.push(cur);
            }
            else {
                if (stack.empty()) {
                    return false;
                }

                if (stack.peek() != getMatchingPair(cur)) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(isValid(s));
    }
}
