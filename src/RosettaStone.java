import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RosettaStone implements ActionListener
{
	HashMap<String, String> map = new HashMap<String, String>();

	JButton button = new JButton();

	String keyFromMap;

	boolean isInEnglish;

	// 1. Rosetta Stone
	// 1. Use a HashMap to store a dictionary of 15 words in English and in
	// Yiddish.
	// 2. Display the english words as buttons on a JPanel.
	// 3. When a button is clicked, it’s spanish equivalent is displayed.
	public static void main(String[] args)
	{
		RosettaStone rs = new RosettaStone();

		rs.dictionary();

		rs.UI();
	}

	public void dictionary()
	{
		map.put("Hello", "העלא");
		map.put("Goodbye", "זייַט געזונט");
		map.put("Good Morning", "אַ גוטנ מאָרגן");
		map.put("Good Night", "אַ גוטע נאַכט");
		map.put("My name is", "מייַן נאָמען איז");
		map.put("I don't like you", "איך טאָן ניט ווי איר");
		map.put("I am the best", "איך בין דער בעסטער");
		map.put("Please", "ביטע");
		map.put("Thank You", "ביטע");
		map.put("I am hungry", "איך בין הונגעריק");
		map.put("I am thirsty", "איך בין דאָרשטיק");
		map.put("I don't understand", "איך טאָן ניט פֿאַרשטיין");
		map.put("Yes", "יאָ");
		map.put("No", "קיין");
	}

	public void UI()
	{
		JPanel panel = new JPanel();

		JFrame frame = new JFrame();

		frame.setVisible(true);

		button.setVisible(true);

		frame.setSize(500, 500);

		frame.add(panel);

		panel.add(button);
		
		keyFromMap = getRandomKey(map);

		button.setText(keyFromMap);

		button.addActionListener(this);
		
	
	}

	String getRandomKey(HashMap<String, String> map)
	{
		String[] keysAsArray = map.keySet().toArray(new String[0]);
		int randomness = new Random().nextInt(map.size());
		return keysAsArray[randomness];
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method tub
		if(map.get(button.getText())== null){
			button.setText(getRandomKey(map));
		}
		else{
			button.setText(map.get(button.getText()));


		}
	}

}
