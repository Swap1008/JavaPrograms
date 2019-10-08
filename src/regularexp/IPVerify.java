package regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPVerify {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("[0-255].*3");
		Matcher m=p.matcher("123.234.153.523");
		
		boolean res=m.matches();
		if (res) {
			System.out.println("Valid IP");
		}else {
			System.out.println("InValid IP");
		}
	}
}
