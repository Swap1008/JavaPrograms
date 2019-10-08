package arrayspgms;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr= {3,5,7,98,3,4,68,7,2,1,2};
		int max=arr[0];
		int min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max= " + max);
		System.out.println("Min = " + min);
	}

}
