package com.in.stack05;

import java.util.Stack;

class Main {
	public static String reverseString(String S) {
		Stack<Character> stack = new Stack<>();

		// Push each character onto the stack
		for (int i = 0; i < S.length(); i++) {
			stack.push(S.charAt(i));
		}

		// Pop each character from the stack and append it to reversedString
		StringBuilder reversedString = new StringBuilder();
		while (!stack.isEmpty()) {
			reversedString.append(stack.pop());
		}

		return reversedString.toString();
	}

	public static void main(String[] args) {
		String S = "Hello, World!";
		System.out.println("Original string: " + S);

		String reversedString = reverseString(S);
		System.out.println("Reversed string: " + reversedString);
	}
}
