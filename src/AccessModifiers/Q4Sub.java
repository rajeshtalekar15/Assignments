package AccessModifiers;

public class Q4Sub extends Q4{
  public int publicField;
  
  
  public static void main(String[] args) {
	Q4Sub obj =  new Q4Sub();
	
	obj.publicField=1;
	obj.publicMethod();
	
}
}
