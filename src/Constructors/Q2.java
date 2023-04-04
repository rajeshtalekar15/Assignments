package Constructors;

public class Q2 {
	Q2(){
		System.out.println("Default constructor");
	}
	Q2(int a){
		System.out.print("Argument constructor:");
		System.out.println(a);
	}
	Q2(int a,String str){
		System.out.print("Multiple Arguments constructor:");
		System.out.println(a + ","+str);
	}
}
