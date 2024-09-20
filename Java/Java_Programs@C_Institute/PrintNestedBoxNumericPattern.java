import java.util.Scanner;

class PrintNestedBoxNumericPattern {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("\nEnter the number that you want the box to have outline with : ");

        int n = kb.nextInt();

        System.out.println("\n");

        for (int i = 0; i <= n - 1; i++) {
            
            int k = n;
            
            for (int j = 0; j < n * 2 - 1; j++) {
                
                System.out.print(k+" ");
                
                if (i <= n - 1) {
                    
                    if (j <= i - 1) {
                        
                        k--;
                    }
                    
                    else if (j >= n * 2 - 2 - i) {
                                        
                        k++;
                    }   
                }
            }
            
            System.out.println();
        }
        
        for (int i = n - 2; i >= 0; i--) {
            
            int k = n;
            
            for (int j = 0; j < n * 2 - 1; j++) {
                
                System.out.printf("%d ", k);
                
                if (i <= n - 1) {
                    
                    if (j <= i - 1) {
                        
                        k--;
                    }
                    
                    else if (j >= n * 2 - 2 - i) {
                                        
                        k++;
                    }   
                }
            }
            
            System.out.println();
        }
    }

}