package com.java.may;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(10);
		stack.push(15);
		stack.push(9);
		stack.push(6);
		stack.push(16);
		stack.push(10);
		System.out.println(stack);
		System.out.println("after pop--->"+stack.pop());
		System.out.println("after peek--->" + stack.peek());
		System.out.println(stack);
	}
}
