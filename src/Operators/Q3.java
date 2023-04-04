package Operators;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers to check for equality: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1==num2){
		System.out.println("The two numbers are equal");
		}
		else if(num1!=num2){
		System.out.println("The numbers are not equal");
		}
	}
}
