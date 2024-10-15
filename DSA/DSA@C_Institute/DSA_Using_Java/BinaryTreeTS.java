import java.util.*;
class BinaryTreeTS
{  static class Node
  {  int data;
    Node left,right;
    Node(int data)
    {  this.data=data;
      this.left=this.right=null;
    }
  }
  static class Pair
  {  Node node;
    int status;
    Pair(Node node)
    {  this.node=node;
      status=1;
    }
  }
  public static void main(String[] args) {
    Integer arr[]={4,5,15,null,null,2,1,null,null,null,4,6,30,null,null,null,6,null,null};
    Node root=new Node(arr[0]);
    Pair rootPair=new Pair(root);
    Stack <Pair> stack=new Stack<>();
    stack.push(rootPair);
    int index=1;
    while(stack.size()>0)
    {  Pair top=stack.peek();
      if(top.status==1)
      {  if(arr[index]!=null)
        {  Node left=new Node(arr[index]);
          top.node.left=left;          
          Pair leftPair=new Pair(left);
          stack.push(leftPair);
        }
        else
        {  top.node.left=null;
        }
        top.status++;
        index++;
      }
      else if(top.status==2)
      {  if(arr[index]!=null)
        {  Node right=new Node(arr[index]);
          top.node.right=right;          
          Pair rightPair=new Pair(right);
          stack.push(rightPair);
        }
        else
        {  top.node.right=null;
        }
        top.status++;
        index++;
      }
      else
      {  stack.pop();
      }
    }    
    displayTree(root);    

    displayLevelOrder(root);
  }
  static void displayTree(Node root)
  {  Pair rootPair=new Pair(root);
    Stack <Pair> stack=new Stack<>();
    stack.push(rootPair);
    String pre="";
    String in="";
    String post="";
    while(stack.size()>0)
    {
      Pair topOfstack=stack.peek();
      if(topOfstack.status==1)
      {  pre+=topOfstack.node.data+" ";
        topOfstack.status++;
        if(topOfstack.node.left!=null)
        {  Pair leftPair=new Pair(topOfstack.node.left);
          stack.push(leftPair);
        }
      }
      else if(topOfstack.status==2)
      {  in+=topOfstack.node.data+" ";
        topOfstack.status++;
        if(topOfstack.node.right!=null)
        {  Pair rightPair=new Pair(topOfstack.node.right);
          stack.push(rightPair);
        }
      }
      else
      {  post+=topOfstack.node.data+" ";
        stack.pop();
      }
    }
    System.out.println("Tree in preorder "+pre);
    System.out.println("Tree in inorder "+in);
    System.out.println("Tree in postorder "+post);
  }

  static void displayLevelOrder (Node root) {

      LinkedList<Node> q = new LinkedList<>();

      q.offer(root);

      int levelNumber = 0;

      while (!q.isEmpty()) {

          int levelSize = q.size();

          System.out.println("Level "+ levelNumber);

          for (int i = 1; i <= levelSize; i++) {

            Node node = q.poll();

            System.out.println(node.data+" ");

            if (node.left != null) {

              q.offer(node.left);
            }

            if (node.right != null) {

              q.offer(node.right);
            }

          }

          levelNumber++;
      }
  }
}