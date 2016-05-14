import java.util.*;
public class InsertionSort {

//Below is the regular insertion sort algorithm with Time Complexity O(n^2). 
//Other way to decrease the time complexity or space complexity is :
	//as all the elements are sorted before key, use binary search instead of linear search.
	// This way the comparisons becomes O(logn) from O(n)
	//But the number of movements still remains O(n)
	
	//Use doubly linked list instead of array to reduce the number of movements from O(n) to O(1).
	//But when u use linked list, you cannot use binary search. 
	//Therefore the time complexity will be O(n).
	
	//2 ways possible ?
	//will try with linked list
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10];
		System.out.println("enter 10 values ");
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<=9;i++)
		{
			array[i] = scanner.nextInt();
			
		}
	
		int key;
		for(int j=1; j<=9;j++)
		{
			key = array[j];
			int i=j-1;
			while ( (i > -1) && ( array[i] > key ) ) {
				
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;			
			
		}
		for(int i = 0; i<=9;i++)
		{
			System.out.println(array[i]);
		} 
	}

}
