package com.selenium;

public class Day2_Ques2 {

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public int mul(int a, int b){
		int c = a * b;
		return c;
	}
	
	public int sub1(int a){
		int c = a -2;
		return c;
	}
	public static void main(String[] args) {
		Day2_Ques2 day2_Ques2 = new Day2_Ques2();
		int sum_total = day2_Ques2.sum(10, 2);
		int sub_total = day2_Ques2.sub(10, 2);
		int mul_total =day2_Ques2.mul(sum_total, sub_total);
		int sub1 = day2_Ques2.sub1(mul_total);
		float result = sub1 / 2;
		System.out.println(result);
		}
}
