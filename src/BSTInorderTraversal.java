import java.util.Scanner;

 class Node{
	int data;
	Node right;
	Node left;
	
	Node(int data)
	{
		this.data = data;
		this.right = null;
		this.left = null;
		
	}
}

//given a node as input, finds the output as in order successor of the given node
public class BSTInorderTraversal {
	
	Node root;
	public void insert(int data){
		Node newnode = new Node(data);
		if(root == null)
		{
			root = newnode;
		}
		else
		{
			Node parent = null; 
			Node current = root;
			while(true)
			{
				parent = current;
				if(newnode.data >= parent.data)
					if(parent.right == null)
					{
						parent.right = newnode;
						return;
					}
					else
					{
						current = parent.right;
					}
				else
				{
					if(parent.left == null)
					{
						parent.left = newnode;
						return;
					}
					else
					{
						current = parent.left;
					}
				}
			}
		}
	}
	public void display(Node root)
	{
		if(root != null)
		{
			display(root.right);
			System.out.println("nodes : " + root.data);
			display(root.left);
		}
			
	}
	boolean find(int data)
	
	{
		Node current = null;
			current = root;
			while(current != null)
			{
				if(current.data == data ){
					return true;
				}
				else 
				{
					if(current.data > data)
					{
						current = current.left;	
					}
					else
					{
						current = current.right;
					}
				}
				
			}
			return false;		
			
		}
	void inordersucc(int data)
	{
		if(find(data))
		{
			Node current;
			current = root;
			if(current.data > data)
			{
				current = current.right;
				while(true)
				{
					
				}
			}
			if(root.left != null)
			{
				current = root.left;
				
			}
		}
		else
			System.out.println("entered node doesn't exist in the tree");
		
			
	}
	public static void main(String[] args) {
		
		BSTInorderTraversal obj = new BSTInorderTraversal();
		obj.insert(5);
		obj.insert(3);
		obj.insert(1);
		obj.insert(8);
		obj.insert(2);
		obj.display(obj.root);
		//System.out.println("enter the node to find the successor node of : ");
		//Scanner sc = new Scanner(System.in);
		//int data = sc.nextInt();
		//obj.inordersucc(data);
		if( obj.find(9))
		{
			System.out.println("found");	
		}
		else 
		{
			System.out.println("not found");
		}
		
	}

}
