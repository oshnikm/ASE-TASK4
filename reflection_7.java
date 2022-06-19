package reflections;

/**
 * 
 * This observation suggests that data integrity is not as strong as first imagined, 
 * as the private member's name and value are obtained in this case. 
 * Setting the accessibility flag to true accomplishes this. 
 * The code asks to turn off data concealing by executing setAccessible(true).
 * 
 * @author Oshni M
 */

import java.lang.reflect.Field;

import reflections.Square;

public class reflection_7 {
	
	public static void main(String[] args) throws Exception{
	    Square s = new Square(10,10);
	    Field[] fields = s.getClass().getDeclaredFields();
	    System.out.printf("There are %d fields\n", fields.length);
	    
	    for (Field f : fields) {
	      f.setAccessible(true);
	      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
	        f.getType(), f.getShort(s));
	    }
	    
	  }

}
