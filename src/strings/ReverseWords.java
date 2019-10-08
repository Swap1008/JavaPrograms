package strings;

public class ReverseWords {

	public static void main(String[] args) {
		String str="SelEnIum Framework is a code structure";
		
		String[] strArr=str.split("\\s");
		String revWords="";
		for (int i = 0; i < strArr.length; i++) {
			for (int j = strArr[i].length()-1; j>=0; j--) {
				revWords=revWords+strArr[i].charAt(j);
			}
			revWords=revWords+" ";
		}
		
		System.out.println(revWords);
	}

}
