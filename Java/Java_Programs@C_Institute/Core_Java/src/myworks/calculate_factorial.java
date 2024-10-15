package myworks;

import java.util.Scanner;

public class calculate_factorial {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("\nEnter an integer : ");
		
		int n = kb.nextInt();
		
		int fact = 1;
		
		for(int i = 1; i <= n; i++){
			fact *= i;
		}
		
		System.out.print("\nFactorial of "+n+" is : "+fact);
		
		kb.close();
	}

}
