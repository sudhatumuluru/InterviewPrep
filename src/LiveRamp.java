import java.util.*;
public class LiveRamp {

	    public static void main(String[] args) {
	    	int A[] = {1, 3, 1, 4, 2, 5};
	    	int X = 7;
	    	int D = 3;
	    	System.out.println("\n Total count is "+solution(A, X, D));
	    }
	    
	    public static int solution(int[] A, int X, int D) {
	    	int temp = 0; int count = 0; boolean first = false, reached = false; int jumpCount = 0 ;
	    	for (int i=0; i<A.length; i++){
	    		if (temp+3 >= X){
	    			reached = true;
					break;
				}
	    		if (A[i] > temp & (A[i]-temp) < D ){
	    			temp = A[i];
	    			jumpCount++;
	    			if (i != 0) {
	        			count++;
	    			}
	    			else {
	    				count++;
	    				first = true;
	    				System.out.println("As I have taken step on position A[0] , im not counting this in my final count");
	    			}
	    	    	System.out.println("I am at position A[" + i+ "] with my step "+ count);   			
	    		}
	    	}
	    	if (first == true & count ==1){
	    		return 0;
	    	}
	    	else if (reached == false){
	    		return -1 ;
	    	}
	    	else if (count == 1){
	    		return 0;
	    	}
	    	else {
	    		return count;  
	    	}
			  	
	    }
	    
	}