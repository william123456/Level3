import static org.junit.Assert.*;

import org.junit.Test;


public class CookieOrderTest {

	@Test
	public void test() {
		
			CookieOrder cookie = new CookieOrder("Samoa", 500);
			assertEquals("Samoa", cookie.getVariety());
			assertEquals(500, cookie.getNumBoxes());
	
			// test setters and getters
			cookie.setNumBoxes(33);
			assertEquals(33, cookie.getNumBoxes());
			cookie.setVariety("Thin Mints");
			assertEquals("Thin Mints", cookie.getVariety());
		}

	}


