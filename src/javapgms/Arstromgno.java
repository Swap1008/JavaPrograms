package javapgms;

public class Arstromgno {

	public static void main(String[] args) {
		int num=1531,rev=0,n=0;
		int temp=num;
		while (num!=0) {
			n=num%10;
			rev=rev+n*n*n;
			num=num/10;
		}
		if (rev==temp) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong");
		}
	}
}
