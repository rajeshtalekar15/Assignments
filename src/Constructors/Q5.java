package Constructors;

public class Q5 {
	Q5(int a){
		System.out.print("Constructor:");
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		Q5 obj1 = new Q5(1);
		Q5 obj2 = new Q5(1);
	}

}
