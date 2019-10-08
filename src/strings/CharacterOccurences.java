package strings;

import java.util.HashMap;

public class CharacterOccurences {

	public static void main(String[] args) {
		String str="java";
		HashMap<Character, Integer> counts=new HashMap<Character, Integer>();
		
		char[] strA=str.toCharArray();
		int count=0;
		for (int i = 0; i < strA.length; i++) {
			if(!counts.containsKey(strA[i])) {
				counts.put(strA[i],1) ;
			}else {
				counts.put(strA[i], counts.get(strA[i]+1));
			}
			
		}
		
		System.out.println(counts);
	}
}
