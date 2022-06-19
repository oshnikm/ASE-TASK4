package reflections;

/**
 * @author Oshni M
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import reflections.Square;

class SquareTest {


	@Test
	public void testLength() {
		Square r = new Square(5,5);	
		assertEquals(5,r.getLength());
	}
	
	@Test
	public void testWidth() {
		Square r = new Square(5,5);	
		assertEquals(5,r.getWidth());
	}
	
	@Test
	public void testArea() {
		Square r = new Square(5,5);
		assertEquals(25,r.getArea());
	}

}
