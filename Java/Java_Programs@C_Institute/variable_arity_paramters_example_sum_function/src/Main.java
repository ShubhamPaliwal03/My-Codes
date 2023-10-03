class Main
{
    static int sum(int ... x)
    {
        int s = 0;

        for(int val : x)
        {
            s += val;
        }

        return s;
    }

    public static void main(String[] args)
    {
        System.out.println(sum());

        System.out.println(sum(1));

        System.out.println(sum(1,2,3));

        System.out.println(sum(1,2,-4,-3,6));

        System.out.println(sum(10,20,30,40,50));
    }
}