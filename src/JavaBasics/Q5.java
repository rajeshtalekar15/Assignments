package JavaBasics;

public class Q5 {
	int a = 10;  //Global variable
	
	 Q5() {
		
		int b = 10;       // Local variable
		int res = a+b;
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		 
		Q5 obj = new Q5();
		 
	}
	
	
}
