package javapgms;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num=159;
		int rev=0;
		int sum=0;
		int temp=num;
		while (num!=0) {
		
			rev=num%10;
			sum=sum+ rev*rev*rev;
			num=num/10;
		}
		
		if (sum==temp) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong");
		}
		
	}
}
