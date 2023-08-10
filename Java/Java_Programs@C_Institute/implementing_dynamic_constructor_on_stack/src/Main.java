class Stack
{
    private int[] stack;
    private int top;

    public Stack(int capacity) // Dynamic Constructor
    {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int n)
    {
        if(top==stack.length-1) // if the stack is full, then we will create a new portion of it in the memory, or simply upgrade its capacity
        {
            System.out.println("\nPrevious Stack Capacity Full! Upgrading its Capacity...");

            int[] tempArr = stack;

            stack = new int[stack.length*2];

            for(int i=0;i<tempArr.length;i++)
            {
                stack[i] = tempArr[i];
            }

        }

        stack[++top] = n;
    }

    public int pop()
    {
        int data_top=-1;

        if(top==-1)
        {
            System.out.println("\nStack Underflow!\nNothing to pop!");
        }
        else
        {
            data_top = stack[top];

            stack[top--] = 0;
        }

        return data_top;
    }

    public int peek()
    {
        if(top!=-1)
        {
            return stack[top];
        }

        return top;
    }
}

class UseMyStack
{
    public static void main(String[] args)
    {
        Stack s1 = new Stack(2);

        for(int i=0;i<=50;i++)
        {
            s1.push(100*i);
        }

        for(int i=0;i<=50;i++)
        {
            System.out.println(s1.pop());
        }

        System.out.println(s1.peek());
    }
}