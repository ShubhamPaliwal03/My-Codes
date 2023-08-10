class Solution
{
    static int find_median(int[] v)
    {
        // Code here
        int median;
        
        if(v.length%2==1)
        {
            Arrays.sort(v);
            
            median = v[v.length/2];
        }
        else
        {
            median = (v[v.length/2] + v[(v.length/2)+1]) / 2;
        }
        
        return median;
    }

    public static void main(String[] args) 
    {
        int[] arr = {19,11};

        find_median(arr);
    }
}