import java.util.Arrays;

class FindMedian
{
    static int find_median(int[] v)
    {
        // Code here
        int median;
        
        if(v.length%2==1)
        {
            Arrays.sort(v);
            
            median = v[(v.length/2)]; // +1-1 gets cancelled so it was omitted here
        }
        else
        {
            Arrays.sort(v);

            median = (v[(v.length/2)-1] + v[v.length/2]) / 2; // +1-1 gets cancelled so it was omitted here
        }
        
        return median;
    }

    public static void main(String[] args) 
    {
        int[] arr = {18, 2, 10, 13, 8, 8};

        System.out.println(find_median(arr));
    }
}