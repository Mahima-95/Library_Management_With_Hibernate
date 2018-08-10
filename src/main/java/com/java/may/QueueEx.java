package com.java.may;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i < 10; i++) {
			queue.add(i);
		}
		
		System.out.println("Queue--> " + queue);
		System.out.println("peek---> " + queue.peek());
		System.out.println("poll---> " + queue.poll());
		System.out.println("After poll Queue--> " + queue);
		System.out.println("size---> " + queue.size());
		System.out.println("remove---> " + queue.remove());
		System.out.println("After removing 1 element Queue--> " + queue);
		System.out.println("Queue--> " + queue.removeAll(queue));
		System.out.println("After removing all elements from Queue--> " + queue);
		System.out.println("use poll method after removing all elements---> " + queue.poll());
		System.out.println("use remove method after removing all elements---> " + queue.remove());
		
		
		
	}
}
