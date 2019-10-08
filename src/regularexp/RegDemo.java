package regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegDemo {

	public static void main(String[] args) {
		String str="Selenium1 Framework is a code structure";
		Pattern p=Pattern.compile("[aeiou]");
		Matcher m=p.matcher(str);
		
		while (m.find()) {
			System.out.print(m.start()+"\t"+m.group());
		}
	}
}
