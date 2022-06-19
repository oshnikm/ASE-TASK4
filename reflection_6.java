package reflections;

import java.lang.reflect.Field;

/**
 * 
 *Both of the public and private member's 
 *accessibility flags have been set to untrue.
 *
 *@author Oshni M
 */

import reflections.Square;

public class reflection_6 {
	
	public static void main(String[] args) throws Exception{
	    Square s = new Square(0,0);
	    
	    Field[] fields = s.getClass().getDeclaredFields();
	    System.out.printf("There are %d fields\n", fields.length);
	    
	    for(Field f : fields) {
	      System.out.printf("field name=%s type=%s accessible=%s\n",
	        f.getName(), f.getType(), f.isAccessible());
	      
	    }
	      
	  }

}
