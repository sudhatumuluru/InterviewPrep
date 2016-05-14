import java.util.*;
public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of elements you would like to enter.....");
		int n = scanner.nextInt();
		System.out.println("enter the elements to be read into an array");
		int[] array = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
		System.out.println("these are the elements u have enetred......");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		
		///bubble sort
		int k;
		for(int i=n;i>=0;i--)         //input - 5, 9, 1 -----loops for 4 times.
		{
			for(int j=0;j<n-1;j++)	// loops for 2 times
			{
				k = j+1;
				if(array[j]>array[k])  // 5 and 9 are compared ==== 9, 1 =====5 1 9 === 5, 1 ===1, 5 9
				{                       /// 5, 9 == 1 5 9 , i=1 
					int temp = array[j];
					array[j]=array[k];
					array[k]=temp;
				}
				
			}
		}
		System.out.println("sorted list is : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("enter the element u would like find the index of : ");
		int element = scanner.nextInt();
		//implement binary search for searching foer element in sirted array
		/* int min = array[0],max=array[n-1],index = (n-1)/2; //index = 9/2 = 4 
		
		for (int i = 0; i<=(n-1)/2;i++)   	// 1 5 9 10 17 18 26 29 74 89   /// search for 74
		{
			if(element > array[index]) 		// 74 > 17
			{
				min = array[index]; 		//min= 17, index =4
				index = (index + (n-1))/2; 	// index = 4
			}	
			if(element == array[index])
			{
				System.out.println("element found at : " + index);
				return;
			}
			if(element < array[index]) 		// 74 > 17
			{
				max = array[index]; 		//min= 17, index =4
				index = index/2; 			// index = 4
			}
		} */
		int min = 0, max = n-1,key,middle;
		System.out.println("enter the key value to search :  ");
		key = scanner.nextInt();
		while(max >= min )
		{
			middle = (min +max)/2;
			if(key > array[middle])
			{
				min = middle+1;
			}
			if(key < array[middle])
			{
				max = middle-1;
			}
			if(key == array[middle])
			{
				System.out.println("element found at  : " + middle);
				return;
			}
		}
	}
}