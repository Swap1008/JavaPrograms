package arrayspgms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr= {10,20,20,30,30,40,50,50};
		
		Set hs=new HashSet();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		
		System.out.println(hs);
	}

}
