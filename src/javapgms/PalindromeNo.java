package javapgms;

public class PalindromeNo {
	public static void main(String[] args) {
		int num=1213,rev=0;
		int temp=num;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if (rev==temp) {
			System.out.println("Palindrome No");
		}else {
			System.out.println("Not an Palindrome");
		}
	}
}
