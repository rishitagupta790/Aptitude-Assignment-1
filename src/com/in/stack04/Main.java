package com.in.stack04;

import java.util.Stack;

class Main {
    public static void insertAtBottom(Stack<Integer> stack, int temp) {
        if (stack.isEmpty()) {
            stack.push(temp);
        } else {
            int popped = stack.pop();
            insertAtBottom(stack, temp);
            stack.push(popped);
        }
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.size() <= 1) {
            return;
        } else {
            int temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed stack: " + stack);
    }
}
