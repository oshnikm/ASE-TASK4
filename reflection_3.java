package reflections;

/**
 * It demonstrates how to find out which class an object is an instance of.
 * getClass returns an object belonging to the class called Class.
  
  @author Oshni M

 */

import reflections.Square;

public class reflection_3 {
	
	public static void main(String[] args) {
		Square s = new Square(0,0);
	    System.out.println("class =" + s.getClass());
	    System.out.println("class name =" + s.getClass().getName());
	}

}
