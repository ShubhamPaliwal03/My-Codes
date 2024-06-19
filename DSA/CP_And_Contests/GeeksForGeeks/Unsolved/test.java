import java.util.Scanner;

public class test {
    static int BreakArray(int[] arr, int n, int m) {
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if(m > n-1){
                return 0;
            }

            if (mid == m) {
                int a = FindOrOfArray(arr, 0, mid);
                int b = FindOrOfArray(arr, mid + 1, n-1);

                return Math.max(a, b);
                
            } else if (m > mid) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return 0;
    }
    static int FindOrOfArray(int[] arr, int s, int e) {
        int or = 0;

        for (int i = s; i <= e; i++) {
        
            or |= arr[i];
        }

        return or;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index where you break the array : ");
        int m = sc.nextInt();


        BreakArray(arr, n, m);
    }
}