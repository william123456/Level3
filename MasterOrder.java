import java.util.ArrayList;

public class MasterOrder {
	ArrayList<CookieOrder> orders;

	public ArrayList getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<CookieOrder> newOrders) {
		orders = newOrders;

	}

	public MasterOrder() {
		orders = new ArrayList<CookieOrder>();

	}

	public void addOrder(CookieOrder cookieToBeAdded) {
		orders.add(cookieToBeAdded);
	}

	public int getTotalBoxes() {
		int totalNumBoxes = 0;
		for (CookieOrder c : orders) {
			totalNumBoxes = totalNumBoxes + c.getNumBoxes();

		}
		return totalNumBoxes;
	}
}
