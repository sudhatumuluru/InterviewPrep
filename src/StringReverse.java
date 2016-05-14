
public class StringReverse {

	//StringBuffer has the least performance among string builder
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "dfghjklouyf ghjkluyt uimnbv";
		char[] a = s.toCharArray();
		String revrse ="";
		for(int i = a.length-1; i>= 0 ;i--)
		{
			revrse = (String) (revrse + a[i]);
		}
		System.out.println(revrse);
		
		//another method using StringBuffer
		String str = "hello world";

		String reverse = new StringBuffer(str).reverse().toString();
		//String reverse = new StringBuilder(str).reverse().toString(); --->this also works
		System.out.println(reverse);
	
	}

}
