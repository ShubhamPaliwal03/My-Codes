import java.util.Scanner;

class Array
{
    private int[] arr;
    private int size=0;
    void InitializeCapacity(int cap)
    {
        Scanner kb = new Scanner(System.in);

        arr = new int[cap];
    }

    int getCapacity()
    {
        return arr.length;
    }

    void print()
    {
        System.out.println("\n");

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    void printActual()
    {
        System.out.println("\n");

        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }

    void put(int index, int value)
    {
        if(index<0)
        {
            System.out.println("\n\nInvalid position/index provided, cannot put "+value+" at non-existing index "+index+"!");
        }
        else if(index>arr.length-1)
        {
            System.out.println("\n\nInternal array is already full, cannot put "+value);
        }
        else
        {
            size++;

            arr[index] = value;
        }
    }

    int getEvenCount()
    {
        int count = 0;

        for (int val : arr)
        {

            if (val % 2 == 0)
            {
                count++;
            }
        }

        return count;
    }

    int getOddCount()
    {
        int count = 0;

        for (int val : arr)
        {

            if (val % 2 == 1)
            {
                count++;
            }
        }

        return count;
    }

    int getPrimeCount()
    {
        int count = 0;

        for(int val : arr)
        {
            int i=2;

            while(i*i<val)
            {
                if(val%i==0)
                {
                    break;
                }
                i++;
            }

            if(i*i>val)
            {
                count++;
            }
        }

        return count;
    }

    boolean isPalindromeArray()
    {
        int i,j;

        for(i=0,j=arr.length-1;i<j;i++,j--)
        {
            if(arr[i]!=arr[j])
            {
                return false;
            }
        }

        return true;
    }

    void append(int value)
    {
        if(size==arr.length)
        {
            System.out.println("\nInternal array is already full, no space to append "+value+"!");
        }
        else
        {
            size++;

            arr[size-1] = value;
        }
    }

    void pop()
    {
        if(size==0)
        {
            System.out.println("\nInternal array is empty, nothing to pop!");
        }
        else
        {
            arr[size-1] = 0;

            size--;
        }
    }

    void unshift()
    {
        int i;

        for(i=0;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }

        arr[i] = 0;

        size--;
    }

    void printCapacity()
    {
        System.out.println("\n");
        System.out.println(arr.length);
    }

    void printSize()
    {
        System.out.println("\n");
        System.out.println(size+1);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Array a1 = new Array();

        a1.InitializeCapacity(7);
        System.out.println(a1.getCapacity());
        a1.printActual();//0 0 0 0 0

        a1.put(0,10);
        a1.put(1,20);
        a1.printActual();//10 20 0 0 0 0 0
        a1.print();

        a1.put(2,30);
        a1.put(3,40);
        a1.put(4,50);
        a1.printActual();//10 20 30 40 50
        a1.print();

        a1.put(5,60);
        a1.printActual();
        a1.print();

        a1.put(-10,70);//Invalid position/index provided

        System.out.println("\n"+a1.getEvenCount());
        System.out.println("\n"+a1.getOddCount());
        System.out.println("\n"+a1.getPrimeCount());
        System.out.println("\n"+a1.isPalindromeArray());

        a1.append(2);
        a1.printActual();
        a1.print();

        System.out.println();

        a1.pop();
        a1.printActual();
        a1.print();

        a1.unshift();
        a1.printActual();
        a1.print();

        a1.printCapacity();

        a1.printSize();
    }
}