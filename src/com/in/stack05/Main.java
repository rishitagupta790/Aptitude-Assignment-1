package com.in.stack05;

import java.util.Stack;

class Main { public static String reverseString(String str) {
    Stack<Character> stack = new Stack<>();

    // Push each character of the string onto the stack
    for (int i = 0; i < str.length(); i++) {
        stack.push(str.charAt(i));
    }

    StringBuilder reversed = new StringBuilder();

    // Pop characters from the stack to construct the reversed string
    while (!stack.isEmpty()) {
        reversed.append(stack.pop());
    }

    return reversed.toString();
}

public static void main(String[] args) {
    String str = "Hello, World!";
    System.out.println("Original String: " + str);
    String reversedStr = reverseString(str);
    System.out.println("Reversed String: " + reversedStr);
}}
