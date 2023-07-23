import java.util.Stack;

class StackDeleteMiddleElement
{
    static void deleteMidUtil(Stack<Integer>s,int sizeOfStack,int mid)
    {
        if(sizeOfStack==mid)
        {
            s.pop();
            return;
        }

        int temp = 0;

        if(sizeOfStack!=mid)
        {
            temp = s.pop();
        }

        deleteMidUtil(s, sizeOfStack-1, mid);

        s.push(temp);
    }

    static void deleteMid(Stack<Integer>s,int sizeOfStack)
    {
        int mid = (sizeOfStack+1)/2;
        
        deleteMidUtil(s, sizeOfStack, mid);
    }
    
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=1;i<=5;i++)
        {
            stack.push(i*10);
        }

        deleteMid(stack,5);

        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}