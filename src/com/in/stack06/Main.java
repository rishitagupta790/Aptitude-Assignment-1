package com.in.stack06;

import java.util.Stack;

class Main {
	public static int evaluatePostfix(String postfix) {
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < postfix.length(); i++) {
			char ch = postfix.charAt(i);

			// If the character is a digit, convert it to an integer and push onto the stack
			if (Character.isDigit(ch)) {
				stack.push(ch - '0');
			} else {
				// If the character is an operator, pop two operands from the stack, perform the
				// operation, and push the result back onto the stack
				int operand2 = stack.pop();
				int operand1 = stack.pop();

				switch (ch) {
				case '+':
					stack.push(operand1 + operand2);
					break;
				case '-':
					stack.push(operand1 - operand2);
					break;
				case '*':
					stack.push(operand1 * operand2);
					break;
				case '/':
					stack.push(operand1 / operand2);
					break;
				}
			}
		}

		// The final result will be the only element left on the stack
		return stack.pop();
	}

	public static void main(String[] args) {
		String postfix = "23*54*+9-";
		int result = evaluatePostfix(postfix);
		System.out.println("Postfix Expression: " + postfix);
		System.out.println("Result: " + result);
	}
}
