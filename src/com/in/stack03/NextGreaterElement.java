package com.in.stack03;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	public static int[] findNextGreaterElement(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		Arrays.fill(result, -1); // Initialize result array with -1

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
				int index = stack.pop();
				result[index] = arr[i];
			}
			stack.push(i);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 25, 7, 8, 6, 10 };
		int[] nextGreaterElements = findNextGreaterElement(arr);

		System.out.println("Element\tNext Greater Element");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t\t" + nextGreaterElements[i]);
		}
	}
}
