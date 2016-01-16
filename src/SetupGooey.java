import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SetupGooey implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;
	JButton button3;
	dataManager dm;

	public static void main(String[] args) {
		SetupGooey sG = new SetupGooey();

		sG.UI();

	}

	public void UI() {
		frame = new JFrame();
		panel = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button1.setText("Button1");
		button2.setText("Button2");
		button3.setText("Button3");
		frame.pack();
		dm = new dataManager();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String uiButton1 = JOptionPane.showInputDialog("What name would you like to add?");
			dm.setNames(uiButton1);
		}

		if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, dm.getNames());
			for (String s : dm.aL) {
				System.out.println(s);
			}

		}

		if (e.getSource() == button3) {
			String uiButton3 = JOptionPane.showInputDialog("What name would you like to search for?");
			if (dm.searchName(uiButton3) == true) {
				JOptionPane.showMessageDialog(null, "This name exists!");
			}

			else {
				JOptionPane.showMessageDialog(null, "This name does not exist!");
			}
		}
	}
}
