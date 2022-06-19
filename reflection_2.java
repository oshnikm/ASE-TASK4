package reflections;

/**
 * @author Oshni M
 */

import reflections.Square;

public class reflection_2 {

	  public static void main(String[] args) {
		    Square s = new Square(10,10);
		    s.setLength(20);
		    
		  // s.squareB(); // You will get a complier error once you uncomment this
		    short l = s.l;
		    
		  
		  // long b = s.b; //You will get a complier error once you uncomment this
		    System.out.println("s=" + s);
		  }
}
