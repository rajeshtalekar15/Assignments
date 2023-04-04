package Constructors;

import java.util.Arrays;

public class Q1 {

	 
	Q1(){
		System.out.println("Default constructor");
	}
	Q1(int a){
		System.out.print("Argument constructor:");
		System.out.println(a);
	}
	Q1(int a,String str){
		System.out.print("Multiple Arguments constructor:");
		System.out.println(a + ","+str);
	}
	
	public static void main(String[] args) {
		Q1 obj1 = new Q1();
		Q1 obj2 = new Q1(1);
		Q1 obj3 = new Q1(1,"Java");
		
	}
}
