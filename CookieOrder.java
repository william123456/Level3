public class CookieOrder {
	String variety;
	int numBoxes;

	/** Constructs a new CookieOrder object. */
	public CookieOrder(String variety, int numBoxes) { /* implementation not shown */
		this.variety = variety;
		this.numBoxes = numBoxes;

	}

	/**
	 * @return the variety of cookie being ordered
	 */
	public String getVariety() { /* implementation not shown */
		return variety;
	}

	public void setVariety(String newVariety) {
		variety = newVariety;
	}

	/**
	 * @return the number of boxes being ordered
	 */
	public int getNumBoxes() { /* implementation not shown */
		return numBoxes;
	}
	
	public void setNumBoxes(int newNumBoxes){
		numBoxes = newNumBoxes;
	}
}
