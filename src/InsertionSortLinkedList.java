import java.util.*;
public class InsertionSortLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the values to be sorted");
		Scanner sc = new Scanner(System.in);
		MyNode a = new MyNode();
		MyNode dummy;
		
		while(true)
			
		{
			a.info = sc.nextInt();
			if(sc.hasNext() == false)
			{
				break;
			}
			else
			{
			System.out.println("i am here 1");
			
		
			//System.out.println("i am here 2");
			System.out.println(a.info);
			System.out.println(a.right.info);
			//a.info= a.right.info;
			}
		}
		
		
	}

}
