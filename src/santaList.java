import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class santaList {
	ArrayList <JLabel> stuff = new ArrayList <JLabel>();
	
public static void main(String [] args) {
	santaList l = new santaList();
l.list();

l.UI();
	
}

private void list() {
	stuff.add(loadImageFromTheInternet("http://media.chick-fil-a.com/Media/Img/catalog/Food/XLarge/Cookie.png"));
	
	stuff.add(loadImageFromTheInternet("http://i.huffpost.com/gen/1124795/thumbs/o-MILK-facebook.jpg"));
	
}

public void UI(){
	JFrame frame = new JFrame();

	JPanel panel = new JPanel();
	
	frame.add(panel);
    
	JLabel cookieLabel = stuff.get(0);
	
frame.addMouseListener(null);
	
	frame.add(cookieLabel);
	
	frame.setVisible(true);
}

private JLabel loadImageFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
	return null;
	}

}
