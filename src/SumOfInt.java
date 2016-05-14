import java.util.*;
public class SumOfInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum, n=0;
		System.out.println("enter the value for n");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		if (n < 0)
		{
			sum = n * (n - 1) /2 * -1;
		}
		else
		{
			sum = n * (n + 1) /2 ;
		}
		
		System.out.println("sum of digits is  : " + sum);

	}

}
