import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class COMEDYCENTRAL implements KeyListener {
	String joke1 = "What do you call a bunch of bunnies in a line moving backwards?";
	
	String punchline1 = "A receding HAREline!";
	
	String joke2 = "Where do dogs go when they lose their tail?";
			
	String punchline2 = "The reTAIL store!";
	
	String joke3 = "What is Bruce Lee's favorite drink?";
	
	String punchline3 = "Wataaah!";
	
	String joke4 = "What do you call dangerous precipitation?";
	
	String punchline4 = "A rain of terror!";
	
ArrayList <String> jokeArray = new ArrayList <String> ();
	
	ArrayList <String> punchlineArray = new ArrayList <String> ();
	
	
public static void main(String[] args) {
	COMEDYCENTRAL cc = new COMEDYCENTRAL();
	
	cc.jokeAndPunchlineMaker();
	
JOptionPane.showMessageDialog(null, "Press space for a joke sure to make you laugh!");
}

public void jokeAndPunchlineMaker() {
	
	jokeArray.add(joke1);
	
	jokeArray.add(joke2);
	
	jokeArray.add(joke3);
	
	jokeArray.add(joke4);
	
	punchlineArray.add(punchline1);
	
	punchlineArray.add(punchline2);
	
	punchlineArray.add(punchline3);
	
	punchlineArray.add(punchline4);
	
	JFrame frame = new JFrame();
	
    frame.setVisible(true);
    
    frame.addKeyListener(this);
}

public void computerRemark(){
	Random rand1 = new Random();
	
	int z = rand1.nextInt(3);
	
if(z == 0){
	try {
		 Runtime.getRuntime().exec("say " + "Hilarious!").waitFor();
	 } catch (Exception e) {
		 e.printStackTrace();
	 }
}
if(z == 1){
	try {
		 Runtime.getRuntime().exec("say " + "Genius!").waitFor();
	 } catch (Exception e) {
		 e.printStackTrace();
	 }
}
if(z == 2){
	try {
		 Runtime.getRuntime().exec("say " + "Rolling on the floor laughing!").waitFor();
	 } catch (Exception e) {
		 e.printStackTrace();
	 }
}
}

@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyTyped(KeyEvent arg0) {
	Random rand = new Random();
	
int i = rand.nextInt(jokeArray.size());

JOptionPane.showMessageDialog(null, jokeArray.get(i));

JOptionPane.showMessageDialog(null, punchlineArray.get(i));

computerRemark();
}	
}

