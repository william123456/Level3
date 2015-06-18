public class Dude {
	private int vicAge = 82;
	private String vicName = "vic wintriss";
	private String vicFirstName = "vic";
	private String vicLastName = "wintriss";
	private int williamAge = 13;

	Dude(String vicFirstName, String vicLastName, int vicAgee) {
		this.vicAge = vicAgee;

		this.vicFirstName = vicFirstName;

		this.vicLastName = vicLastName;

	}

	public int getAge() {
		return this.vicAge;
	}

	public String getName() {
		return vicFirstName + " " + vicLastName;
	}
	
	
}
