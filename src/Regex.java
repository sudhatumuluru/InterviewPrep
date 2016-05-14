import java.util.regex.*;
public class Regex {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("0");
		Matcher m = pattern.matcher("111111111111111111111100000000000000000000");
		while(m.find())
		{
			System.out.println("Starting index of 0 is : " + m.start());
			break;
		}
		
	}

}
