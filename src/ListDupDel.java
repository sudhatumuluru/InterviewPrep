import java.util.*;
public class ListDupDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList<String> strlist = new ArrayList<String>();
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		
		 intlist.add(14);
		 intlist.add(7);
		 intlist.add(39);
		 intlist.add(40);
		 intlist.add(14);
		 intlist.add(43);
		 intlist.add(391);
		 intlist.add(40);
		 intlist.add(14677);
		 intlist.add(7);
		 intlist.add(3439);
		 intlist.add(4320);
		/* strlist.add("sudha");
			strlist.add("siva");
			strlist.add("sicbha");
			strlist.add("sivhgjahdja");
			strlist.add("sivggdjgdkhada");
		System.out.println("enter your desired item : ");
		Scanner scanner= new Scanner(System.in);
		String element = scanner.nextLine();
		strlist.add(element);
		System.out.println("your list is :" + strlist);
		ArrayList<String> al2 = new ArrayList<String>(strlist.subList(1, 4));
		System.out.println(al2);
		for(String checker : strlist)
			al2.add(strlist.contains(al2) ? "yes" : "no");
		System.out.println(al2);
		System.out.println("checking for duplicates.....");
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.addAll(strlist);
		//System.out.println("duplicates are present.....they are .......");
		strlist.clear();
		strlist.addAll(lhs);
		System.out.println("removed duplicates......your purified list is " + strlist);
		
		System.out.println("size of the inetger array is :" + intlist.size()); */
		ArrayList<Integer> dup = new ArrayList<Integer>();
		for (int i = 0; i< intlist.size() ; i++)
		{
			int temp = intlist.get(i);
			for(int j = 1; j < intlist.size(); j++)
			{
				if(temp == intlist.get(j))
				{
					if(!dup.contains(temp))
					dup.add(temp);
				}
			}
		}
		System.out.println("sudha : input     : " + intlist);
		System.out.println("sudha : output    :" + dup);
		System.out.println("using hasmap and set.....");
		LinkedHashSet<Integer> lhm = new LinkedHashSet<Integer>();
		System.out.println("sudha : input     : " + intlist);
		lhm.addAll(intlist);
		intlist.clear();
		intlist.addAll(lhm);
		System.out.println("sudha : input     : " + intlist);
	}

}
