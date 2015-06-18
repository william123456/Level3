import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetitionAgain
{

	public static void main(String[] args)
	{
		LongChipCompetitionAgain lcca = new LongChipCompetitionAgain();

		lcca.initializeBeatles();

		lcca.findingWinner();

	}

	public void findingWinner()
	{
		double longestChipLength = 0;
		String nameOfBeatle = null;
		for (Beatle b : theBeatles)
		{
			for (Chip c : b.getChips())
			{

				if (c.getLength() > longestChipLength)
				{
					longestChipLength = c.getLength();
					nameOfBeatle = b.getName();
				}
			}

		}
		System.out.println(nameOfBeatle + " has the longest chip at " + longestChipLength + "km");
	}

	/**
	 * The Beatles are eating lunch and playing a game to see who has the
	 * longest chip. (In England, french fries are called "chips".)
	 * 
	 * Find the Beatle with the longest chip. You may not edit the Chip or
	 * Beatle classes. Make sure to initialize The Beatles before you start your
	 * search.
	 * 
	 * **/

	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	private void initializeBeatles()
	{
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");

		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}
}

class Beatle
{
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name)
	{
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips()
	{
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++)
		{
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("in"))
				chips.add(new Chip(10));
		}
	}

	public ArrayList<Chip> getChips()
	{
		return this.chips;
	}

	public String getName()
	{
		return this.name;
	}

}

class Chip
{
	private double length;

	public double getLength()
	{
		return length;
	}

	Chip(double d)
	{
		this.length = d;
	}
}
