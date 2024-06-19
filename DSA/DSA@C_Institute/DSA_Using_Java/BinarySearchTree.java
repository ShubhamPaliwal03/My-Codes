class BinarySearchTree
{
	static class Node
	{
		int data;

		Node left, right;

		Node(int data)
		{
			this.data = data;

			left = right = null;
		}
	}

	public static void traversePreorder(Node root)
	{
		if(root == null)
		{
			return;
		}

		System.out.print(root.data+" ");

		traversePreorder(root.left);

		traversePreorder(root.right);
	}

	public static void traverseInorder(Node root)
	{
		if(root == null)
		{
			return;
		}

		traverseInorder(root.left);

		System.out.print(root.data+" ");

		traverseInorder(root.right);
	}

	// public static void createBSTUtil(int[] input, int i, Node root)
	// {
	// 	if(i == input.length)
	// 	{
	// 		System.out.println("BST created successfully...");

	// 		return;
	// 	}

	// 	Node node = new Node(input[i]);

	// 	if(node.data < root.data)
	// 	{
	// 		root.left = node;

	// 		createBSTUtil(input, i + 1, root.left);
	// 	}
	// 	else
	// 	{
	// 		root.right = node;

	// 		createBSTUtil(input, i + 1, root.right);
	// 	}
	// }

	// public static Node createBST(int[] input)
	// {
	// 	Node root = new Node(input[0]);

	// 	createBSTUtil(input, 1, root);

	// 	return root;
	// }

	public static Node insertNodeIntoBST(Node root, int data) 
	{
        if(root == null) 
        {
            return new Node(data);
        }

        if(data < root.data) 
        {
            root.left = insertNodeIntoBST(root.left, data);
        }
        else 
        {
            root.right = insertNodeIntoBST(root.right, data);
        }

        return root;
    }

    public static Node createBST(int[] input) 
    {
        Node root = null;

        for(int data : input)
        {
            root = insertNodeIntoBST(root, data);
        }

        return root;
    }

	public static void main(String[] args)
	{
		int[] input = new int[]{7, 4, 12, 3, 6, 8, 1, 5, 10};

		Node root = createBST(input);

		traversePreorder(root);

		System.out.println();

		traverseInorder(root);
	}
}