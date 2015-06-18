import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;


public class DinnerDecider {
static	ArrayList <String> dinnerChooser = new ArrayList <String>();
	public static void main(String[] args) {
	String UI = JOptionPane.showInputDialog("Would you like to know your dinner tonight?");	
		
	
	dinnerChooser.add("Eat a taco!");
	
	dinnerChooser.add("Eat pizza!");
	
	dinnerChooser.add("Eat beef and broccoli!");
	
	dinnerChooser.add("Eat dumplings!");
	
	DinnerDecider dd = new DinnerDecider();
	
	if(UI.equals("yes")){
		dd.foodSelector();
		
	}
	else{
		JOptionPane.showMessageDialog(null, "Ok, bye.");
	}

	}
	
	public void foodSelector(){
		Random rand = new Random();
		
		int i = rand.nextInt(dinnerChooser.size());
		JOptionPane.showMessageDialog(null, dinnerChooser.get(i));
		
			}
}
