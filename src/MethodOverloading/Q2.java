package MethodOverloading;

public class Q2 {
	public void method(int a,int b) {
		System.out.println(a+","+b);
	}
	public void method(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Q2 obj = new Q2();
		obj.method(1,2);
		obj.method("Java");
	}
}
