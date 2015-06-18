import static org.junit.Assert.*;

import org.junit.Test;


public class dudeTest {
	@Test
	public void testBasicConstruction() {
		Dude vic = new Dude("vic", "wintriss", 82);
		assertEquals("vic wintriss", vic.getName());
		assertEquals(82, vic.getAge());
	}
	public void williamTest(){
		Dude william = new Dude("william", "bonitz", 13);
		assertEquals("william bonitz", william.getName());
		assertEquals(13, william.getAge());
	}


}
