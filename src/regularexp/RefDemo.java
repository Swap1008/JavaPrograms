package regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RefDemo {



	public static void main(String[] args) {
		String str="asdhaAl34E57pR9nT0543";
		char[] ch=str.toCharArray();
		String str1="";
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				str1=str1+Character.toString(ch[i]).toLowerCase();
			}else {
				str1=str1+Character.toString(ch[i]).toUpperCase();
			}
		}
		
		System.out.println(str1);
		
	}

}
