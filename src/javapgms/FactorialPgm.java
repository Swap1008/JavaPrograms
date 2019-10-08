package javapgms;

public class FactorialPgm {

	public static void isFactorial(int num) {
		int fact =1;
		for (int i = 1; i <= num ; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial = " + fact);
	}
	public static int recFactorial(int num) {
		if(num==0) {
			return 1;
		}else {
			return num*recFactorial(num-1);
		}
	}
	public static void main(String[] args) {
//		isFactorial(5);
		int fact=recFactorial(5);
		System.out.println("Fact = " + fact);
	}

}
