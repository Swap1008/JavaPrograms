package strings;

public class ReverseStringPreserveSpace {

	public static void main(String[] args) {
		String str="Selenium Framework is a code structure";
		
		StringBuffer sb=new StringBuffer("SelEnIum Framework is a code structure");
		String revStr="";
		
		for (int i = str.length()-1; i>=0 ; i--) {
			revStr=revStr+str.charAt(i);
			
		}
		System.out.println(revStr);
		System.out.println();
		System.out.println(sb.reverse());
	}

}
