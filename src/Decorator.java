import java.util.ArrayList;


public class Decorator{
	public static void main(String[] args) {
		Ornament bobble1 = new Ornament();
		
		Ornament bobble2 = new Ornament();
		
		Ornament bobble3 = new Ornament();
		
		bobble1.color = "red";
		
		bobble2.color = "green";
		
		bobble3.color = "silver";
		
		ArrayList<Ornament> decor = new ArrayList<Ornament>();
		
		decor.add(bobble1);
		decor.add(bobble2);
		decor.add(bobble3);
		
		for(Ornament o : decor){
			o.hang();
		}
		

	}

}
