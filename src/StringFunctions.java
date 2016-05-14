//import java.util.*;
public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// charAt - returns the char at the index 
		String a = "sudha siva ";
		String d = "sudha siva ";
		String b = "sree kumar";
		String c = "SUDHA SIVA";
		String e = "$$sudha ›› sree";
		String[] f = e.split("$$");
		System.out.println("charAt function		 : " + a.charAt(4));
		System.out.println("codepointAt		     : " + a.codePointAt(2));
		System.out.println("codepointBefore 	 : " + a.codePointBefore(2));
		System.out.println("codepointCount 		 : " + a.codePointCount(2, 8));
		System.out.println("equals		    	 : " + a.equals(d));
		System.out.println("contentEquals   	 : " + a.contentEquals(c));
		System.out.println("equalsIgnorecase	 : " + a.equalsIgnoreCase(c));
		System.out.println("compareTo            : " + a.compareTo(b));
		System.out.println("compareToIgnorecase	 : " + a.compareToIgnoreCase(b));
		System.out.println("startsWith			 :"	 + a.startsWith("si" , 6));
		System.out.println("startsWith			 :"	 + a.startsWith("si"));
		System.out.println("endsWith			 :"	 + a.endsWith("va " ));
		System.out.println("hashCode			 :"	 + a.hashCode());
		System.out.println("indexOf				 :"	 + a.indexOf("a"));
		System.out.println("lastIndexOf			 :"	 + a.lastIndexOf("a"));
		System.out.println("substring			 :"	 + a.substring(5));
		System.out.println("subSequence			 :"	 + a.subSequence(6, 9));
		System.out.println("concat				 :"	 + a.concat(b));
		System.out.println("replace				 :"	 + a.replace(" ", "siva"));
		System.out.println("matches				 :"	 + e.matches("$$"));
		System.out.println("contains			 :"	 + e.contains("$") + e.contains("›"));
		System.out.println("split				 :"	 + e.split("sud"));
		System.out.println("valueOf				 :"	 + a.valueOf("fghjk"));
		System.out.println("trim				 :"	 + a.trim());
	}

}