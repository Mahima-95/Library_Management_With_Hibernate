package com.selenium;

public class Day2_Ques1 {

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
	public static void main(String[] args) {
		Day2_Ques1 day2_Ques1 = new Day2_Ques1();
		int sum_total = day2_Ques1.sum(10, 2);
		int sub_total = day2_Ques1.sub(10, 2);
		int mul_total =day2_Ques1.mul(sum_total, sub_total);
		int result = mul_total - 2;
		System.out.println(result);
		}
}
