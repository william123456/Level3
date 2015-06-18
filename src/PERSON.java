import javax.swing.JOptionPane;


public class PERSON {
	private int age;
	
	private String superPower;
	
	private static void main(String[] args) {
		PERSON person = new PERSON();
		
		person.setAge(15);
		
		person.setSuperPower("super speed and the ability to fly");
		
		JOptionPane.showMessageDialog(null, "You are " + person.getAge() + " year's old and your superpower is " + person.getSuperPower() + ".");
		
	}
	
	public String toString(){
		return age + superPower;
	}
public void setAge(int age){
this.age = age;
}

public int getAge(){
	return this.age;
}

public void setSuperPower(String superPower){
	this.superPower = superPower;
}

public String getSuperPower(){
	return this.superPower;
}
}
