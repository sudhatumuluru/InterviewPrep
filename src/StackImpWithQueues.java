import java.util.LinkedList;
import java.util.Queue;

public class StackImpWithQueues {

	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();

	void push(int element)
	{
		if (q1.peek() == null) 
		{
            q1.add(element);
        } 
		else {
            for (int i = q1.size(); i > 0; i--) {
                q2.add(q1.remove());
            }
            q1.add(element);
            for (int j = q2.size(); j > 0; j--) {
                q1.add(q2.remove());
            }
        }	
	}
	int pop()
	{
		
		if (q1.peek() == null) {
            System.out.println("The stack is empty, nothing to return");
            int i=0;
            return i;
        } else {
            int pop = q1.remove();
            return pop;
        }
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackImpWithQueues s1 = new StackImpWithQueues(); 
	s1.push(1);
	s1.push(2);
	s1.push(3);
	System.out.println(s1.pop());
	System.out.println(s1.pop());
	System.out.println(s1.pop());
	}

}
