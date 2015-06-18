
	import java.util.Random;

	public class Surpriser {
		// Your mission: Use delegation to see what kind of a toy is inside the KinderSurprise
		public static void main(String[] args) {
			KinderSurprise myKinderSurprise = new KinderSurprise(new Egg(new Toy()));
			
			Egg egg = myKinderSurprise.getKinderSurpriseContents();
			
			Toy toy = egg.getEggContents();
			
			String actualToy = toy.getToy();
			
			System.out.println(actualToy);
		}
	}

	class KinderSurprise {
		private Egg egg;

		public KinderSurprise(Egg egg) {
			this.egg = egg;
		}

		Egg getKinderSurpriseContents() {
			return egg;
		}
	}

	class Egg {

		private Toy toy;

		public Egg(Toy toy) {
			this.toy = toy;
		}

		Toy getEggContents() {
			return toy;
		}

	}

	class Toy {
		String getToy() {
			int randomToySelector = new Random().nextInt(2);
			if (randomToySelector == 0)
				return "play doh";
			else if (randomToySelector == 1)
				return "(^>.<^)";
			else
				return "spongebob";
		}

	}



