import java.util.Stack;

import javax.swing.JOptionPane;
public class StackPractice
{

public static void main(String[] args)
{
	Stack <Character> letters = new Stack <Character>();
	
	String x = JOptionPane.showInputDialog("Enter a name to be reversed!");
	
	for(int i = x.length() - 1; i>=0; i--){
		letters.push(x.charAt(i));
	}
      JOptionPane.showMessageDialog(null, letters);
	
}
}