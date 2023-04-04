package ThisAndSuper;

public class Q5A extends Q5{
	private int childField;
	
	public Q5A(int parentField) {
		super(parentField);
		this.childField=1;
		System.out.println("Constructor");
		System.out.println(childField);
		
	}
	
	public static void main(String[] args) {
		Q5A obj = new Q5A(1);
		
	}

}
