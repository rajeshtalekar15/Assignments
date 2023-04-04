package ThisAndSuper;

public class Q6A extends Q6{

	private String major;
	
	public Q6A(int id, String name, String major) {
        super(id,name);
        this.major = major;
        System.out.println("id:"+id+" name:"+name+" major:"+major);
    }
	
	public static void main(String[] args) {
		
		Q6A obj = new Q6A(1, "Raj", "Java");
	}
}
