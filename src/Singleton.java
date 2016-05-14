
public class Singleton {

	private static Singleton soleInstance = new Singleton();
	private Singleton() //restricting to create a instance by keeping private to constructor
	{
		System.out.println("I'm in singleton....creating your instance........");
	}
	public static Singleton getInstance() //giving global access
	{
		return soleInstance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//testing if we have created a singleton design pattern
class TestClass{
	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		//if 2 objects have same hashcode, it means they are pointing to the same reference
		//so testing the same
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
	}
	
}