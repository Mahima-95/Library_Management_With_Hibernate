package com.selenium;


public class Child1 extends Parent1{
	
	Child1(){
		super(66);
		System.out.println("Child Default method");
	}
	
	public static void main(String[] args) {
		
		Child1 child1= new Child1();
	}

}
