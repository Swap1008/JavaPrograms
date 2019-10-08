package arrayspgms;

import java.util.Arrays;

public class ThirdLargest {

	public static void main(String[] args) {
		int[] arr= {23,15,77,98,3,24,68,7,42,18,209};
		/*
		 * Arrays.sort(arr);
		 * 
		 * System.out.println(arr[arr.length-3]);
		 */
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Third Largest = " + arr[arr.length-3]);
	}
	
}
