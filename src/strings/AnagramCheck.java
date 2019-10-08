package strings;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";
		
		char[] st1=str1.toCharArray();
		char[] st2=str2.toCharArray();
		Arrays.sort(st1);
		Arrays.sort(st2);
		boolean result =Arrays.equals(st1, st2);
		if (result) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not anagram");
		}
				
		
	}
}
