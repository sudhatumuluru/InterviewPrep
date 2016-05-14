
public class MaxOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maxSum=0, currSum=0, i;
		int[] input = {1, -2, 3, 10, -4, 7, 2, -5};
		
		for(i=0;i<=7;i++)
		{
			if(currSum <= 0 ) 
			{
				currSum = input[i]; 
			}
			else
			{
				currSum += input[i];
			}
			if(currSum > maxSum) 
			{
				maxSum = currSum;  
			}
		}	
		System.out.println(currSum);
		System.out.println(maxSum);

		
	}

}
