import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class UniqueCharInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "SudhasivaSreeKumar";
		int count=1;
		String upper = word.toLowerCase();
//Method 0:
		System.out.println(word.chars().distinct().count());  // returns 12
		char[] letter = word.toCharArray();

//Method 1:
		//gives the first occurence of the letter in a word.
		ArrayList<Character> first = new ArrayList<Character>();
		for(int i =0; i< upper.length();i++)
		{
			if(!first.contains(upper.charAt(i)))
			{
				first.add(upper.charAt(i));
			}
		}
		System.out.println(first);
		System.out.println(first.size());
		
//Method 2:
		HashSet set = new HashSet();
		for(int j = 0; j< upper.length(); j++)
		{
			set.add(upper.charAt(j));
			
		}
		System.out.println(set.size());
		System.out.println(set);
		
		/*
		HashMap m = new HashMap();
		for(char temp : letter)
		{
			count = m.containsKey(letter)? (Integer) m.get(letter) +1:1;
					m.put(letter, count);
					//System.out.println(m.get(letter));
		}
		 Iterator<String> itr = m.entrySet().iterator();
		while(itr.hasNext())
		{
			String unique = (String) itr.next();
			//String uni = 
			System.out.println(unique);
		}
			
		*/
			
	}

}
