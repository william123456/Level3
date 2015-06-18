import java.util.ArrayList;


// Copyright Wintriss Technical Schools 2013

public class RemovingStuffFromArrayLists {
	
	public static void main(String[] args) {

		class Stuff {}
		class Worm extends Stuff {}
		class Dirt extends Stuff {}
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		for(int i = 0; i < stuffIFoundInTheYard.size(); i++){
			if(stuffIFoundInTheYard.get(i) instanceof Dirt){
			stuffIFoundInTheYard.remove(stuffIFoundInTheYard.get(i));
			i--;
			}
			
		}
			System.out.println(stuffIFoundInTheYard.size());
		/* TODO 1: Clean out the dirt but keep the delicious worms. */ 

		System.out.println(stuffIFoundInTheYard.size());	//should be 2

		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('g');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
truth.add(' ');
		truth.add('s');
		truth.add('#');
		truth.add('u');
		truth.add('#');
		truth.add('#');
		truth.add('c');
		truth.add('k');

		/* TODO 2: Remove the hash symbols and print out the truth. */

	}
}
