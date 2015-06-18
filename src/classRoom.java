
public class classRoom {
	public static void main(String[] args) {
	PERSON oscar = new PERSON();
	
	PERSON william = new PERSON();
	
	PERSON savera = new PERSON();
	
	oscar.setAge(100);
	
	oscar.setSuperPower("Obliviousness");
	
	william.setAge(13);
	
	william.setSuperPower("Just being awesome");
	
	savera.setAge(45);
	
	savera.setSuperPower("qwhourg;");
	
	System.out.println(william.toString());
	
	System.out.println(savera.toString());
	
	System.out.println(oscar.toString());
	}

}
