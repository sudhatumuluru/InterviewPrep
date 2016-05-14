
public class StringTest123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nospl="My name is Sudha and my husband name is Siva. He is so sweet";   
		   String mystringSub="My name is Sudha and my husband name is Siva. He is so sweet";  
		   System.out.println("Test Run");
		   int i=0;
		   while(i<nospl.length())
		   {
		    if(mystringSub.indexOf(" ",1)>0)
		    {
		    System.out.println(mystringSub.substring(0,mystringSub.indexOf(" ",1)));
		    i=i+(mystringSub.substring(0,mystringSub.indexOf(" ",1))).length()+1;
		    mystringSub = mystringSub.substring((mystringSub.substring(0,mystringSub.indexOf(" ",1))).length(),mystringSub.length());
		    }
		    else
		    {
		     System.out.println(mystringSub.substring(0,mystringSub.length()));
		    }
		   
		   }
	}

}
