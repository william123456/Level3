import java.util.ArrayList;


public class OVERFLOW {
	int i;
	public static void main(String[] args) {
		OVERFLOW o = new OVERFLOW();
		
		o.someRandomMethod();
	}
	public void someRandomMethod(){
		ArrayList <String> blehs = new ArrayList <String>();
		for(i = 0; i<1000000000; i++){
		blehs.add("a;lskejt");
		}
		
		System.out.println(i);
	}
}
