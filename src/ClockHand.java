import java.util.*;
import java.math.*;
public class ClockHand {
	final static double hangle = 0.5;
	final static int mangle = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//This is a program to find the angle between hours hand and minutes hand in a clock
		
		System.out.println("enter the time in hh,mm format");
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		int hh = Integer.parseInt(time.substring(0, 2));
		//System.out.println("hh" + hh);
		int mm = Integer.parseInt(time.substring(3, 5));
		//System.out.println("mm" + mm);
		double hanglenew = calculate_hangle(hh,mm);
		int manglenew = calculate_mangle(mm);
		System.out.println("angle between 2 hands is :" + Math.abs(hanglenew-manglenew));
	}

	private static int calculate_mangle(int mm) {
		// TODO Auto-generated method stub
		int manglenew = (mm * 6)* mangle;
		return manglenew;
	}

	private static double calculate_hangle(int hh, int mm) {
		// TODO Auto-generated method stub
		double hanglenew;
		//System.out.println(hh);
		if(hh == 12)
		{
			 hh = 0;
			 hanglenew = (mm * hangle);
		}
		else 
		{
			 hanglenew = (hh * 60 + mm)* hangle;
		}
		
		//System.out.println("hanglenew" + hanglenew);
		return hanglenew;
	}

}
