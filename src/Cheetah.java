
public class Cheetah {
	int milesPerHour;
	String name;
	boolean isSmart;
	int numberOfSpots;
	String favoriteFood;
	boolean canUseLiterallyInCorrectForm;
	public static void main(String[] args) {
		Cheetah cheetah = new Cheetah(99, "Pete", true, 55000, "Canned Tuna", false);
		
		cheetah.run();
		
		cheetah.smile();
		
	cheetah.interview();
	}
	public void interview(){
		System.out.println("So, Mr. um...." + name + " the Cheetah. You are apparently smart but cannot use literally\n in the correct form. You can run up to " + milesPerHour + " miles per hour and you also have " + numberOfSpots + "\n spots. Is all of this information true and accurate? Pete: NOT AT ALL :WET:LWEKJTW:ELTJWE:LTKJWE:TLWEJT:WLEKTJ:LJWE:TKLJ");
	}
	
	Cheetah(int milesPerHour, String name, boolean isSmart, int numberOfSpots, String favoriteFood, boolean canUseLiterallyInCorrectFor){
		this.milesPerHour = milesPerHour;
		this.name = name;
		this.isSmart = isSmart;
		this.numberOfSpots = numberOfSpots;
		this.favoriteFood = favoriteFood;
		this.canUseLiterallyInCorrectForm = canUseLiterallyInCorrectForm;
	}

	public void run(){
		System.out.println("RUN RUN RUN CHEETAH!!");
	}
	
	public void smile(){
		System.out.println("cheetah is smiling now");
	}
}
