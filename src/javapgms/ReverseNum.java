package javapgms;

public class ReverseNum {

	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		int rev=0;
		while (num>0) {
			rev=num%10;
			sum=sum*10+rev;
			num=num/10;
		}
		
		System.out.println(sum);
	}
}
