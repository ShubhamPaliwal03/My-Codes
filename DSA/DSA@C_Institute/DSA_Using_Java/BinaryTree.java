import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.LinkedList;

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

	public static Node createTreeFromPreorder(Integer[] preorder)
	{
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

		return root;
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

	public static void displayLevelOrder(Node root) // Remove, Print, Add (technique / algorithm)
	{
		Queue<Node> queue = new ArrayDeque<>();

		queue.add(root);

		int level_number = 0;

		while(queue.size() > 0)
		{
			System.out.print("\nLevel "+level_number+" : ");

			// we store the size of the current level in a seperate varible
			// to ensure that we only iterate through the nodes at the current level, without being affected by changes in the
			// queue size, due to dynamic node additions in the queue while the loop is running

			int levelSize = queue.size();

			for(int i = 0; i < levelSize; i++)
			{
				Node node = queue.remove();

				System.out.print(node.data+" ");

				if(node.left != null)
				{
					queue.add(node.left);
				}

				if(node.right != null)
				{
					queue.add(node.right);
				}
			}

			System.out.println();

			level_number++;
		}
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

	// the height of a binary tree is equal to the max depth of the binary tree
	// the depth of a binary tree is equal to the number of nodes from the root of the binary tree to a leaf node
	// it is either based on the number of edges in the path, or the number of nodes in the path

	public static int getHeight(Node root, int curr_height, int max_height)
	{
		if(root == null)
		{
			max_height = Math.max(max_height, curr_height);

			curr_height = 0;

			return 0;
		}

		max_height = getHeight(root.left, curr_height, max_height);

		curr_height++;

		max_height = getHeight(root.right, curr_height, max_height);

		return max_height + 1;
	}

	// two binary trees are identical if they are structurally symmetrical, and their nodes have the exact same values

	// iterative approach, level order traversal (BFS)

	static boolean areIdentical(Node root1, Node root2) 
    {
        // if both root of both trees point to null
        
        if(root1 == null && root2 == null)
        {
            return true;
        }
        
        // if root of one tree is null, while the root of other tree is not null
        
        else if(root1 == null || root2 == null)
        {
            return false;
        }
        
        Queue<Node> queue1 = new LinkedList<>();
        Queue<Node> queue2 = new LinkedList<>();
        
        queue1.offer(root1);
        queue2.offer(root2);
        
        // iterate until both the queues are empty, or until the trees are identical
        
        while(!queue1.isEmpty() && !queue2.isEmpty())
        {
            int levelSize1 = queue1.size();
            int levelSize2 = queue2.size();
            
            // if both the trees have unequal number of nodes for any particular level
            
            if(levelSize1 != levelSize2)
            {
                return false;
            }
            
            for(int i = 1; i <= levelSize1; i++)
            {
                Node node1 = queue1.poll();
                Node node2 = queue2.poll();
                
                // if the values or data of both the nodes are not equal
                
                if(node1.data != node2.data)
                {
                    return false;
                }
                
                // if the left child of the current node of both the trees is not null
                
                if(node1.left != null && node2.left != null)
                {
                    queue1.offer(node1.left);
                    queue2.offer(node2.left);
                }
                
                // if left child of one node is null, while the left child of other node is not null
                
                else if(node1.left != null || node2.left != null)
                {
                    return false;
                }
                
                // if the right child of the current node of both the trees is not null
                
                if(node1.right != null && node2.right != null)
                {                    
                    queue1.offer(node1.right);
                    queue2.offer(node2.right);
                }
                
                // if the right child of one node is null, while the right child of other node is not null
                
                else if(node1.right != null || node2.right != null)
                {
                    return false;
                }
            }
        }
        
        return true;
    }

    // below function was giving wrong answer on some online test cases

	// static boolean areIdentical(Node root1, Node root2)
	// {
	// 	Queue<Node> queue1 = new LinkedList<>();
	// 	Queue<Node> queue2 = new LinkedList<>();

	// 	queue1.add(root1);
	// 	queue2.add(root2);

	// 	while(!queue1.isEmpty() || !queue2.isEmpty())
	// 	{
	// 		int levelSize1 = queue1.size();
	// 		int levelSize2 = queue2.size();

	// 		if(levelSize1 != levelSize2)
	// 		{
	// 			return false;
	// 		}

	// 		for(int i = 1; i <= levelSize1; i++)
	// 		{
	// 			Node node1 = queue1.poll();
	// 			Node node2 = queue2.poll();

	// 			if(node1.left != null && node2.left != null)
	// 			{
	// 				if(node1.left.data != node2.left.data)
	// 				{
	// 					return false;
	// 				}
					
	// 				queue1.offer(node1.left);
	// 				queue2.offer(node2.left);
	// 			}

	// 			if(node1.right != null && node2.right != null)
	// 			{
	// 				if(node1.right.data != node2.right.data)
	// 				{
	// 					return false;
	// 				}

	// 				queue1.offer(node1.right);
	// 				queue2.offer(node2.right);
	// 			}
	// 		}
	// 	}

	// 	return queue1.isEmpty() && queue2.isEmpty();
	// }

	public static String[] iterativelyTraverseInAllOrders(Node root)
	{
		Stack<Pair> stack = new Stack<>();

		Pair rootPair = new Pair(root);

		stack.push(rootPair);

		StringBuilder preorder_traversal = new StringBuilder();
		StringBuilder inorder_traversal = new StringBuilder();
		StringBuilder postorder_traversal = new StringBuilder();

		while(stack.size() > 0)
		{
			Pair top = stack.peek();

			if(top.status == 1)
			{
				preorder_traversal.append(top.node.data+" ");

				top.status++;

				if(top.node.left != null)
				{
					stack.push(new Pair(top.node.left));
				}
			}
			else if(top.status == 2)
			{
				inorder_traversal.append(top.node.data+" ");

				top.status++;

				if(top.node.right != null)
				{
					stack.push(new Pair(top.node.right));
				}
			}
			else
			{
				postorder_traversal.append(top.node.data+" ");

				stack.pop();
			}
		}

		return new String[]{preorder_traversal.toString(), inorder_traversal.toString(), postorder_traversal.toString()};
	}

	public static boolean containsNode(Node root, int target_value)
	{
		// if current node is null

		if(root == null)
		{
			return false;
		}

		// if the data of the current node is equal to the target value

		if(root.data == target_value)
		{
			return true;
		}

		// check if the target value node exists in any substree out of left or right

		return containsNode(root.left, target_value) || containsNode(root.right, target_value);
	}

	public static void printNodeToRootPath(Node root, int target_value, Stack<Integer> path)
	{
		// if current node is null

		if(root == null)
		{
			return;
		}

		// if we have reached the target value node,
		// then we will print the node to root path stored in the path stack, by popping the elements from the stack one by one
 
		if(root.data == target_value)
		{
			path.push(root.data);

			while(!path.isEmpty())
			{
				System.out.print(path.pop()+" ");
			}

			return;
		}

		// push the current node value into the path stack

		path.push(root.data);

		// check for the target value in the left substree

		printNodeToRootPath(root.left, target_value, path);

		// check for the target value in the right subtree

		printNodeToRootPath(root.right, target_value, path);

		// after both the left and right subtrees have been travered, and the target hasn't been reached, then
		// pop the last (top) node value from the path stack, so that we can try out a new path, keeping the same previous values

		if(!path.isEmpty())
		{
			path.pop();
		}
	}

	public static boolean hasPath(Node root, int target) {

		if (root == null) {

			return false;
		}

		if (root.data == target) {

			return true;
		}

		boolean nodeExistsInLeft = hasPath(root.left, target);

		if (nodeExistsInLeft) {

			return true;
		}

		boolean nodeExistsInRight = hasPath(root.right, target);

		if (nodeExistsInRight) {

			return true;
		}

		return false;
	}

	// static int current_level = 0;

	public static void printAllNodesAtGivenLevel(Node root, int current_level, int target_level) {

		if (root == null) {

			return;
		}

		if (current_level == target_level) {

			System.out.print(root.data + " ");

			return;
		}

		printAllNodesAtGivenLevel(root.left, current_level + 1, target_level);

		printAllNodesAtGivenLevel(root.right, current_level + 1, target_level);
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		// create an array, containing the preorder traversal of the binary tree which you want to create

		Integer[] preorder1 = {10, 5, 17, null, null, 18, 5, null, null, null, 9, 4, 3, null, null, null, 6, null, null};

		Integer[] preorder2 = {1, 2, null, null, 3, null, null};

		Node root1 = createTreeFromPreorder(preorder1);

		Node root2 = createTreeFromPreorder(preorder2);

		System.out.println("\nThe Preorder Traversal Of The Binary Tree (performed via recursive method) is as follows :\n");

		displayPreorder(root1);

		System.out.println("\n\nThe Inorder Traversal Of The Binary Tree (performed via recursive method) is as follows :\n");

		displayInorder(root1);

		System.out.println("\n\nThe Postorder Traversal Of The Binary Tree (performed via recursive method) is as follows :\n");

		displayPostorder(root1);

		int max = getMaxNodeValue(root1, Integer.MIN_VALUE);

		System.out.print("\n\nThe Max Value present in the given Binary Tree is : "+max);

		int sum = getSumOfAllNodes(root1, 0);

		System.out.print("\n\nThe Sum of All Nodes present in the given Binary Tree is : "+sum);

		int count = getNumberOfNodes(root1);

		System.out.print("\n\nThe Number of Nodes present in the given Binary Tree are : "+count);

		int height = getHeight(root1, 0, 0);

		System.out.print("\n\nThe Height (Max Depth) of the given Binary Tree is : "+height);

		System.out.println("\n\nThe Level Order Traversal of the given Binary Tree is : ");

		displayLevelOrder(root1);

		if(areIdentical(root1, root2))
		{
			System.out.println("\nBoth The Binary Trees Are Identical...");
		}
		else
		{
			System.out.println("\nBoth The Binary Trees Are Not Identical...");
		}

		String[] allOrderTraversals = iterativelyTraverseInAllOrders(root1);

		String preorder_traversal = allOrderTraversals[0];

		String inorder_traversal = allOrderTraversals[1];

		String postorder_traversal = allOrderTraversals[2];

		System.out.println("\nThe Preorder Traversal Of The Binary Tree (performed via iterative method) is as follows :\n");

		System.out.print(preorder_traversal);

		System.out.println("\n\nThe Inorder Traversal Of The Binary Tree (performed via iterative method) is as follows :\n");

		System.out.print(inorder_traversal);

		System.out.println("\n\nThe Postorder Traversal Of The Binary Tree (performed via iterative method) is as follows :\n");

		System.out.print(postorder_traversal);

		System.out.print("\n\nEnter the value of the node which you want to search in the binary tree : ");

		int target_value = kb.nextInt();

		if(containsNode(root1 , target_value))
		{
			System.out.print("\nA Node Found Having Value = "+target_value+" in the given binary tree...");
		}
		else
		{
			System.out.print("\nNo Node Found Having Value = "+target_value+" in the given binary tree...");
		}

		System.out.println("\nEnter the target value of the node to which you want to check if a path from root node exists or not : ");

		int target = kb.nextInt();

		if (hasPath(root, target)) {

			System.out.println("\nA Path Exists from Root node to Target node " + target + "!");
		}
		else {

			System.out.println("\nNo Path Exists from Root node to Target node " + target + "!");
		}

		System.out.println();

		System.out.print("\n\nEnter the value of the node from which you want to trace out the path to the root of the tree : ");

		target_value = kb.nextInt();

		System.out.print("\nThe Node To Root Path from node having value = "+target_value+" is : ");

		printNodeToRootPath(root1, target_value, new Stack<Integer>());

		printAllNodesAtGivenLevel(root1, 0, 4);
	}
}