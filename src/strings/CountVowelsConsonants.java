package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String str="SelEnIum Framework is a code structure";
		
		Pattern p1=Pattern.compile("[aeiouAEIOU]");
		Matcher m=p1.matcher(str);
		int count=0;
		while (m.find()) {
			System.out.print(m.group()+" ");
			count++;
		}
		System.out.println("Count = " + count);
	}
}
