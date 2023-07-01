package com.in.stack07;

import java.util.Stack;

class Main {
	private Stack<Integer> stack;
	private Stack<Integer> minStack;

/** Initialize your data structure here. */
public Main() {
    stack = new Stack<>();
    minStack = new Stack<>();
}

	/** Push element x onto the stack. */
	public void push(int x) {
		stack.push(x);
		if (minStack.isEmpty() || x <= minStack.peek()) {
			minStack.push(x);
		}
	}

	/** Removes the element on top of the stack. */
	public void pop() {
		int removed = stack.pop();
		if (removed == minStack.peek()) {
			minStack.pop();
		}
	}

	/** Get the top element of the stack. */
	public int top() {
		return stack.peek();
	}

	/** Retrieve the minimum element in the stack. */
	public int getMin() {
		return minStack.peek();
	}
}
