import java.util.*;
public class SudokuCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=9,n=9;
		boolean indicator;
		
		int[][] sudoku = {
				{5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,9,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}
				
		};
		//Scanner scanner = new Scanner(System.in);
		//sudoku[][] = scanner.nextInt();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++)
			{
				if((sudoku[i][j]) > 9 && sudoku[i][j] < 1)
				{
					System.out.println("invalid enteries in sudoku");
					return;
				}
			}
		}
			
	}
}
