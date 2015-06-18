import java.util.ArrayList;

public class MasterOrder
{
	ArrayList <CookieOrder> cookies;
	int totalNumBoxes;
	MasterOrder(){
		 cookies = new ArrayList<CookieOrder>();
		
	}
	public ArrayList <CookieOrder> getOrders()
	{
		return cookies;

	}

	public void setOrders(ArrayList <CookieOrder> cookies)
	{
		this.cookies = cookies;
	}
	
	public void addOrder(CookieOrder cooky){
		cookies.add(cooky);
		 totalNumBoxes = totalNumBoxes + cooky.getNumBoxes();
	}
	
	public int getTotalBoxes(){
		return totalNumBoxes;
	}
}
