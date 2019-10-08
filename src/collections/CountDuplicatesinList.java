package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CountDuplicatesinList {
	public static void main(String[] args) {
		 ArrayList list = new ArrayList();
	      list.add( "cat" );
	      list.add( "dog" );
	      list.add( "pig" );
	      list.add( "cow" );
	      list.add( "pig" );
//	      System.out.println(Collections.frequency(list, "pig"));
	      
	      for (Object object : list) {
			System.out.println(object +"\t"+Collections.frequency(list, object));
		}
	}

}
