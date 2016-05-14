import java.text.BreakIterator;
import java.util.*;
import java.util.StringTokenizer;
public class WordOccurence {

	public static void main(String[] args) {
		
		//Converting the sentence to set of words using split (in built function)
		String mystring="My name is Sudha and my husband name is Siva. He is so sweet. My friend name is Sudheeshna and her husband name is kalyan. Both are sweet ";
		String[] array = mystring.replace(".","").split(" ");
		String nospl = mystring.replace(".", "");
		
		String temp; int counter,j;
		boolean consider = true;
		int m=0;
		String[] array2 = new String[m];
		
		//dividing the string into words using string tokenizer
		StringTokenizer st = new StringTokenizer(nospl, " ");
		//System.out.println(st.countTokens());
		int h=0;
		/* while(st.hasMoreTokens() && m < st.countTokens())
		{
			array2[m] = st.nextToken();
			m++;
			//System.out.println(array2[m]);
		} */
		
		//dividing the string using hashset
		
		
		//dividing the sentence into words without using split
		
		
		 for(int i = 0; i<=nospl.length()-1;i++)
		{
			array2[m] = nospl.substring(i,nospl.indexOf(" ",i+1));
			i = i + nospl.indexOf(" ",m);
			m = m + 1;
		}  
		 int n = mystring.length();
		 String words[] = new String[n]; 
		 int s=0;
		 Scanner sc;
		 while(n <=0)
		 {
			 words[s] = sc.delimiter();
			 
		 }
		//counting the occurrence of the word
		for (int i = 0; i< array.length;i++)
		{
			temp = array[i];
			j = i+1;
			counter = 1;
			for(int k = i-1;k>=0;k--)
			{
				if(array[i].equalsIgnoreCase(array[k]))
				{
					consider = false;
					break;
				}	
				else 
					consider = true;
			}
			if(consider == true)
			{
				while(j <= array.length-1)
				{
					if(temp.equalsIgnoreCase(array[j]))
					{
						counter++;
					}
					j++;
				}
				System.out.println("the word \"" + temp + "\" occured : " + counter + " times ");
			}	
		}
		
		//Converting the sentence to set of words using break iterator (in built function)
		System.out.println("\n \nbreak iterator starts here........................");
		BreakIterator words = BreakIterator.getWordInstance();
		words.setText(mystring);
		printEachForward(words, mystring);
	}

	public static void printEachForward(BreakIterator boundary, String source) {
	     int start = boundary.first();
	     for (int end = boundary.next();
	          end != BreakIterator.DONE;
	          start = end, end = boundary.next()) {
	          System.out.println(source.substring(start,end));
	     }
	 }
}
