package com.selenium;



public class Parent1 
{
	Parent1(){
		System.out.println("parent default method");
	}
	
	Parent1(int a){
		this();
		System.out.println("Parent 1 Parameterized method");
	}
	
}
