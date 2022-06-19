package reflections;

/**
 * @author Oshni M
 */

import static org.junit.jupiter.api.Assertions.*;
import static reflections.KUnit.checkEquals;
import static reflections.KUnit.checkNotEquals;
import static reflections.KUnit.report;

import org.junit.jupiter.api.Test;

class KUnitTest {

	void checkConstructorAndAccess() {
		Square s = new Square (5, 5);
		checkEquals(s.getLength(),5);
		checkEquals(s.getWidth(),5);
		checkNotEquals(s.getLength(),4);
		checkNotEquals(s.getWidth(),4);
		
	}

	void checkgetArea() {
		Square s=new Square(5,5);
		s.getArea();
		checkNotEquals(s.getArea(),5);
		checkEquals(s.getArea(),25);
		
	}
	
	public static void main(String[] args) {
		KUnitTest ts=new KUnitTest();
		ts.checkConstructorAndAccess();
		ts.checkgetArea();
		report();
		
	
	}

}
