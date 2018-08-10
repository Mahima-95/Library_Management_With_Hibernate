package com.java.may;

public class ThreadEx implements Runnable{

	private int count;

	public int increamentCount() {
		count++;
		return count;
	}

	public static void main(String[] args) {
		ThreadEx ex = new ThreadEx();
		ex.run();
	}

	@Override
	public void run() {
		increamentCount();
		System.out.println(count);
		increamentCount();
		System.out.println(count);
	}
}
