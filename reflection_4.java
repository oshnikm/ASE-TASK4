package reflections;

/**
 * The private access modifier has prevented the b field's contents from being disclosed. 
 * This demonstrates that data hiding works and that Java is capable of maintaining 
 * data integrity.
 * 
 * @author Oshni M
 */

import java.lang.reflect.Field;

import reflections.Square;

public class reflection_4 {
	
	 public static void main(String[] args) throws Exception{
		  Square s = new Square(0,0);
	    
	     Field[] fields = s.getClass().getFields();
	     System.out.printf("There are %d fields\n", fields.length);
	     
	      for(Field f : fields) {
	        System.out.printf("field name=%s type=%s value=%d\n", 
	        		f.getName(), f.getType(), f.getShort(s));
	    }
	  }

}
