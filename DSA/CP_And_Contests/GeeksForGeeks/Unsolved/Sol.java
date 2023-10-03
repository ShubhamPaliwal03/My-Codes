class Sol
{
    public static void main(String args[]) 
    {
        // Write your code here.

        int[] a = {1,5,2,2,4};

        int max=a[0];
        int bwo=0;

        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {

                bwo = 0;

                for(int k=i;k<=j;k++)
                {
                    bwo = bwo | a[k];
                }

                if(max>bwo)
                {
                    max = bwo;
                }

            }
        }

        System.out.println(max);
    }
}