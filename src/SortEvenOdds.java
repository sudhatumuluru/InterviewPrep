import java.lang.reflect.Array;
import java.util.*;
public class SortEvenOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* 
 * Method to solve :
 * 4 % 2 ==0 , inserted into array2[0]; and j =1 ; m=0; i =1;
 * 17 % 2 != 0 , inserted into array2[10] ; and j=1;m=1;i=2;
 * maintained i for looping over array, 
 * j for inserting evens in first part of the array
 * m for inserting odds in last part of the array
 * with Arrays.sort(array); ===> Time complexity is O(n^2)  - so changing to bubble sort for O(n)
 */
		int[] array = {4,17,8,5,16,4,7,19,6,9,3,22,23};
		Arrays.sort(array);
		int j = 0,m=array.length-1,temp;
		int[] array2 = new int[array.length];
		for(int i = 0; i<= array.length-1;i++)
		{
			if(array[i] % 2 == 0)
			{
				array2[j] = array[i];
				j++;
			}
				
			else
			{
				array2[m] = array[i];
				m--;
			}
		}
		System.out.println("m = " + m);
		System.out.println("j = " + j);
		m = array.length-1;
		while(j < m ) // j = 5, m = 10 ;j = 6, m = 9 ; j = 7, m = 8 ; j = 8, m = 7
		{ 
			temp = array2[j];
			array2[j] = array2[m];
			array2[m] = temp;
			j++;
			m--;
		}
		for(int k = 0; k<= array.length-1;k++)
		{
			System.out.println("k : " +k +" "+ array2[k]);
		} 
		
	}

}
