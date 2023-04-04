package MethodOverloading;

public class Q4 {
	public void method(int a,int b) {
		System.out.println(a+","+b);
	}
	public void method(String str1,String str2) {
		System.out.println(str1+","+str2);
	 
	}
	
	public static void main(String[] args) {
		Q4 obj = new Q4();
		obj.method(1,2);
		obj.method("Java", "Selenium");
	}
}
