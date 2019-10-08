package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(102);
		al.add(45);
		al.add(2);
		al.add(124);
		al.add(98);
		System.out.println(al);
		Collections.sort(al);
		
		System.out.println(al);
	}
}
