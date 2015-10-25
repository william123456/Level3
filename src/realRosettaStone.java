import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.crypto.provider.RSACipher;

public class realRosettaStone implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	HashMap<String, String> rS = new HashMap <String, String> ();
	int i = 0;

	public static void main(String[] args) {
		realRosettaStone rRS = new realRosettaStone();
		rRS.UI();
	}

	public void hashMapWork() {
		rS.put("Hola", "Hello");
		rS.put("Adios", "Goodbye");
		rS.put("Cosa", "Thing");
		rS.put("Vida", "Life");
		rS.put("Hombre", "Man");
		rS.put("Momento", "Moment");
		rS.put("Casa", "House");
		rS.put("Mundo", "World");
		rS.put("Mujer", "Woman");
		rS.put("Pais", "Country");
		rS.put("Lugar", "Place");
		rS.put("Persona", "Person");
		rS.put("Trabajo", "Work");
		rS.put("Mano", "Hand");
		rS.put("Fin", "End");

	}

	public void UI() {
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		button.setText(getRandomKey(rS));
		frame.setVisible(true);
		frame.pack();
		

	}

	String getRandomKey(HashMap<String, String> map) {
		String[] keysAsArray = map.keySet().toArray(new String[0]);
		int randomness = new Random().nextInt(map.size());
		return keysAsArray[randomness];
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, rS.get(button.getText()));

	}

}
