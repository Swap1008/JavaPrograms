package strings;

public class String1 {
	public static void main(String[] args) {
		String str1="Hello";
		String str2=new String("Hello");
		
		System.out.println(str1==str2);
		String str3=str2.intern();
		System.out.println(str3==str1);
	}
}
