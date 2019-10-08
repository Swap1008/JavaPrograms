package javapgms;

public class FibonacciSeries {
	static int n1=0,n2=1,n3;
	public static void fibo(int num) {
		if (num>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibo(num-1);
		}
	}
	public static void main(String[] args) {
		int c=10;
		System.out.print(n1+" "+n2);
		fibo(c-2);
		
	}
}
