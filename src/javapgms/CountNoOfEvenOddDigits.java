package javapgms;

public class CountNoOfEvenOddDigits {

	public static void main(String[] args) {
		int num=124568734;
		int rev=0;
		int evenDigit=0;
		int oddDigit=0;
		while (num>0) {
			rev=num%10;
			
			if (rev%2==0) {
				evenDigit++;
			}else {
				oddDigit++;
			}
			
			num=num/10;
		}
		
		System.out.println("Even Count =\t"+evenDigit);
		System.out.println("Odd Count=\t"+oddDigit);
	}
}
