import static org.junit.Assert.*;

import org.junit.Test;

public class MasterOrderTest {

	@Test
	public void test() {

		MasterOrder goodies = new MasterOrder();
		goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
		goodies.addOrder(new CookieOrder("Shortbread", 5));
		goodies.addOrder(new CookieOrder("Macaroon", 2));
		goodies.addOrder(new CookieOrder("Chocolate Chip", 3));

		assertEquals(11, goodies.getTotalBoxes());
	}

}
