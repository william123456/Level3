
public class CookieOrder{
	String variety;
	int numBoxes;
	
	CookieOrder(String variety, int numBoxes){
		this.variety = variety;
		this.numBoxes = numBoxes;
	}
	
	public String getVariety(){
		return variety;
	}

	public void setVariety(String newValueOfVariety){
		variety = newValueOfVariety;
		
	}
	
	public int getNumBoxes(){
		return numBoxes;
	}
	
	public void setNumBoxes(int newValueOfNumBoxes){
		numBoxes = newValueOfNumBoxes;
	}
}
