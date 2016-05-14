
public class RevCapLetrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "asAfsBjlsfC";
		char[] inputarr = input.toCharArray();
		String output="";
		//char temp;
		for(int i = 0; i<= input.length()-1 ;i++)
		{
			if(((int)input.charAt(i))  > 96)
			output=output+Character.toString(input.charAt(i));
			else
			{
				for(int j = input.length()-1;j>i;j--)
				{
					if(input.charAt(j) < 96)
					{
						swap(input.charAt(j),input.charAt(i));
						return;
					}
				}
			}
			
		}
	}

	private static void swap(char charAt, char charAt2) {
		// TODO Auto-generated method stub
		char temp1 = charAt;
		charAt = charAt2;
		charAt2 = temp1;
	}

}
