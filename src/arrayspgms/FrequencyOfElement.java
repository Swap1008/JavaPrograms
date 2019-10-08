package arrayspgms;

import java.util.Arrays;


public class FrequencyOfElement {

	public static void main(String[] args) {
		int[] arr= {3,5,7,98,3,4,68,7,2,1,2};
		
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
					
				}
			}
			System.out.println("Element = "+ arr[i] + "\t = " + count);
		}
	
	}
}
