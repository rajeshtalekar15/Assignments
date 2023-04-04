package ThisAndSuper;

public class Q4 {
	private int id;
    private String course;
    
    public Q4(int id, String course) {
        this.id = id;
        this.course = course;
    }
    
    public Q4() {
        this(0, "");  
    }
    
    public static void main(String[] args) {
		Q4 obj = new Q4();
		obj.id=1;
		obj.course="ss";
		
	}
}
