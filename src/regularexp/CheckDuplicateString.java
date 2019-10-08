package regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDuplicateString {
	public static void main(String[] args) {
		String str="a r b k c d se f g a d f s s f d s ft gh f ws w f v x s g h d h j j k f sd j e wed a d f";
		
		Pattern p=Pattern.compile("\\s");
		String strArr[]=p.split(str);
		
		for (String string : strArr) {
			
		}
		
	}

}
