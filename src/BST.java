class node{
	int data;
	node left;
	node right;
	node(int data)
	{
		this.left = null;
		this.right = null;
	}
	
}
public class BST {

	node root;
	
	void insert(int data)
	{
		node current = root;
		node parent;
		node newnode = new node(data);
		if(root == null)
		{
			root = newnode;
		}
		else
		{
			while(true)
			{
				parent = current;
				if(parent == null)
				{
					parent = newnode;
					return;
				}
				else
				{
					if(parent.data > data)
					{
						current = parent.left;
					}
					else
					{
						current = parent.right;
					}
				}
			}
		}
	}
	void display(node n)
	{
		if(root!= null)
		{
			display(root.right);
			System.out.println(root.data);
			display(root.left);
			
		}
	}
	public static void main(String[] args) {
		BST newnode = new BST();
		newnode.insert(4);
		newnode.insert(5);
		newnode.insert(8);
		newnode.insert(1);
		newnode.insert(0);
		newnode.insert(3);
		newnode.display(newnode.root);
	}

}

