package MethodOverloading;

import java.util.Arrays;

public class Q1 {
	
	public void method(int a,int b) {
		System.out.println(a+","+b);
	}
	public void method(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Q1 obj = new Q1();
		obj.method(1,2);
		obj.method(1);
	}

}
