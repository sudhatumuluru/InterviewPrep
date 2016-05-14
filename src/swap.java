
public class swap {

	 int x = 10,y=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap s = new swap();
		System.out.println("x  value is " + s.x + "     y value is " + s.y);
		s = s.swapval(s);
		System.out.println("x  value is " + s.x + "     y value is " + s.y);
	}
	swap swapval(swap d)
	{
		int temp = d.x ;
		d.x=d.y;
		d.y=temp;
		return d;
	}
}
