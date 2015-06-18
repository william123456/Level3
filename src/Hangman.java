import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

import javax.swing.*;

public class Hangman implements KeyListener
{
	Stack<String> puzzleWords;
	JFrame frame;
	JPanel panel;
	JLabel label;
	ArrayList<JLabel> boxes;

	public static void main(String[] args)
	{
Hangman hm = new Hangman();

hm.UI();


	}
	


	public void UI()
	{
		 frame = new JFrame();
		 panel = new JPanel();
		 label = new JLabel(puzzleWords.pop());
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		frame.pack();
	}
	public void addPuzzles(){
		puzzleWords = new Stack<String>();
		puzzleWords.push("puzzle");
		puzzleWords.push("hangman");
		puzzleWords.push("supercalifragilisticexpialidocious");
		if(puzzleWords.peek() == "puzzle"){
			
		}
		boxes = new ArrayList<JLabel>();
	}
	
	private void updateSpacesWithUserInput(char keyChar) {
		for (int i = 0; i < label.getText().length(); i++) {
			if (label.getText().charAt(i) == keyChar) {
				boxes.get(i).setText("" + keyChar);
			}
		}
	}


	@Override
	public void keyPressed(KeyEvent e)
	{
		// TODO Auto-generated method stub
		System.out.println("SL:DFJ:LSDJKFF");
		label.setText(puzzleWords.pop());
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
