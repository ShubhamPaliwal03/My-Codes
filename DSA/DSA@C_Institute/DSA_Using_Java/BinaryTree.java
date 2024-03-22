import java.util.Stack;

class BinaryTree
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

	static class Pair
	{
		Node node;

		int status;

		Pair(Node node)
		{
			this.node = node;

			status = 1;
		}
	}

	public static void displayPreorder(Node root) // Visit Node, Visit Left Subtree, Visit Right Subtree (N -> L -> R)
	{
		if(root == null)
		{
			return;
		}

		// Visit Node

		System.out.print(root.data+" ");

		// Visit Left Subtree

		displayPreorder(root.left);

		// Visit Right Subtree

		displayPreorder(root.right);
	}

	public static void displayInorder(Node root) // Visit Left Subtree, Visit Node, Visit Right Subtree (L -> N -> R)
	{
		if(root == null)
		{
			return;
		}

		// Visit Left Subtree

		displayInorder(root.left);

		// Visit Node

		System.out.print(root.data+" ");

		// Visit Right Subtree

		displayInorder(root.right);
	}

	public static void displayPostorder(Node root) // Visit Left Subtree, Visit Right Subtree, Visit Node (L -> R -> N)
	{
		if(root == null)
		{
			return;
		}

		// Visit Left Subtree

		displayPostorder(root.left);

		// Visit Right Subtree

		displayPostorder(root.right);

		// Visit Node

		System.out.print(root.data+" ");
	}

	public static int getMaxNodeValue(Node root, int max)
	{
		if(root == null)
		{
			return max;
		}

		if(root.data > max)
		{
			max = root.data;
		}

		max = getMaxNodeValue(root.left, max);

		max = getMaxNodeValue(root.right, max);

		return max;
	}

	public static int getSumOfAllNodes(Node root, int sum)
	{
		if(root == null)
		{
			return sum;
		}

		sum += root.data;

		sum = getSumOfAllNodes(root.left, sum);

		sum = getSumOfAllNodes(root.right, sum);

		return sum;
	}

	public static int getNumberOfNodes(Node root)
	{
		if(root == null)
		{
			return 0;
		}

		int countLeft = getNumberOfNodes(root.left);

		int countRight = getNumberOfNodes(root.right);

		return countLeft + countRight + 1;
	}

	public static void main(String[] args)
	{
		// create an array, containing the preorder traversal of the binary tree which you want to create

		Integer[] preorder = {10, 5, 17, null, null, 18, 5, null, null, null, 9, 4, 3, null, null, null, 6, null, null};

		// Integer[] preorder = {1, 2, null, null, 3, null, null};

		// create the root node

		Node root = new Node(preorder[0]);

		// create the root pair

		Pair rootPair = new Pair(root);

		// create a stack

		Stack<Pair> stack = new Stack<>();

		// push the root pair into the stack

		stack.push(rootPair);

		// create a variable to track the index at which you are in the preorder array currently

		int index = 1;

		// perform the below operations until the stack is not empty

		while(stack.size() > 0)
		{
			// get the pair at the top of the stack

			Pair top = stack.peek();

			// if the status of the pair at the top of the stack is 1

			if(top.status == 1)
			{
				// if the element at current index of the preorder array is not null

				if(preorder[index] != null)
				{
					// create the left node, having the data present at the current index of the preorder array

					Node left = new Node(preorder[index]);

					// make the left node, the left child of the node present in the pair present at the top of the stack

					top.node.left = left;

					// create the left pair, containing the left node, and status = 1 (as set by default)

					Pair leftPair = new Pair(left);

					// push the left pair into the stack

					stack.push(leftPair);
				}

				// if the element at current index of the preorder array is null

				else
				{
					// make null, the left child of the node present in the pair present at the top of the stack

					top.node.left = null; // not needed though, as it is already set to null by default
				}

				// update the status of the pair on the top of the stack

				top.status++;

				// increase the index

				index++;
			}

			// if the status of the pair at the top of the stack is 2

			else if(top.status == 2)
			{
				// if the element at current index of the preorder array is not null

				if(preorder[index] != null)
				{
					// create the right node, having the data present at the current index of the preorder array

					Node right = new Node(preorder[index]);

					// make the right node, the right child of the node present in the pair present at the top of the stack

					top.node.right = right;

					// create the right pair, containing the right node, and status = 1

					Pair rightPair = new Pair(right);

					// push the right pair into the stack

					stack.push(rightPair);
				}

				// if the element at current index of the preorder array is null

				else
				{
					// make null, the right child of the node present in the pair present at the top of the stack

					top.node.right = null; // not needed though, as it is already set to null by default
				}

				// update the status of the pair on the top of the stack

				top.status++;

				// increase the index

				index++;
			}

			// if the status of the pair at the top of the stack is 3

			else
			{
				// pop the pair present at the top of the stack

				stack.pop();
			}
		}

		System.out.println("\nThe Preorder Traversal Of The Binary Tree is as follows :\n");

		displayPreorder(root);

		System.out.println("\n\nThe Inorder Traversal Of The Binary Tree is as follows :\n");

		displayInorder(root);

		System.out.println("\n\nThe Postorder Traversal Of The Binary Tree is as follows :\n");

		displayPostorder(root);

		int max = getMaxNodeValue(root, Integer.MIN_VALUE);

		System.out.print("\n\nThe Max Value present in the given Binary Tree is : "+max);

		int sum = getSumOfAllNodes(root, 0);

		System.out.print("\n\nThe Sum of All Nodes present in the given Binary Tree is : "+sum);

		int count = getNumberOfNodes(root);

		System.out.print("\n\nThe Number of Nodes present in the given Binary Tree are : "+count);
	}
}