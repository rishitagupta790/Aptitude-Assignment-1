package com.in.stack02;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElement {
	public static int[] findNearestSmallerElement(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		Arrays.fill(result, -1); // Initialize result array with -1

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && stack.peek() >= arr[i]) {
				stack.pop();
			}
			if (!stack.isEmpty()) {
				result[i] = stack.peek();
			}
			stack.push(arr[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 5, 2, 25, 7, 8, 6, 10 };
		int[] nearestSmallerElements = findNearestSmallerElement(arr);

		System.out.println("Element\tNearest Smaller Element");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t\t" + nearestSmallerElements[i]);
		}
	}
}
