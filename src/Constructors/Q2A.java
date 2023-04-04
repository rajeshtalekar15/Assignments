package Constructors;

public class Q2A extends Q2{

	Q2A(){
		super();
	}
	Q2A(int a){
		super(1);
	}
	Q2A(int a, String str){
		super(1,"Java");
	}
	
	public static void main(String[] args) {
		Q2A obj1 = new Q2A();
		Q2A obj2 = new Q2A(1);
		Q2A obj3 = new Q2A(1,"Java");
	}
}
