import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;


public class bandNameGenerator {
public static void main(String[] args) {
	
    ArrayList<String> adjectives = new ArrayList();
    
    ArrayList <String> nouns = new ArrayList();
    
    adjectives.add("The Weird");
    
    adjectives.add("The Stupid");
    
    adjectives.add("The Oblivious");
    
    adjectives.add("The Irresistable");
    
    nouns.add(" Aliens");
    
    nouns.add(" Rockstars");
    
    nouns.add(" Unicorns");
    
    nouns.add(" Pies");
   
    Random random = new Random();
    int rand = random.nextInt(adjectives.size());
    
    int mrRand = random.nextInt(nouns.size());

    JOptionPane.showMessageDialog(null, "Your band name is " + adjectives.get(rand) + nouns.get(mrRand));
	
	
}

}