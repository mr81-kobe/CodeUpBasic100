package bais100;

import java.util.Scanner;

public class Main94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt(); 
		int temp=0;
		int [] array = new int [n];
		
		for(int j=0; j<n; j++) {
			
			array[j]=scan.nextInt();
			
		}
		
		
		//0 9 1 8 2 7 3 6 4 5 
		
		
		
		
		for(int j=n-1; j>=0; j--) {
			
			System.out.print(array[j]+" ");
			
		}
		
		
	}

}
