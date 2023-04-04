package Interfaces;

import java.util.Arrays;

public class Q1 implements Q1Interface {

	@Override
	public void methodOne() {
		System.out.println("Interface method");
	}

	public static void main(String[] args) {
		Q1 obj = new Q1();
		
		obj.methodOne();
	}

}
