package bais100;

import java.util.Scanner;

public class Main93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		
		int [] nArray = new int [n]; 
		int [] ansArray = new int [23] ;
		
		for(int j=0; j<23; j++) {
			ansArray[j]=0;
		}
		
		
		
		for(int i=0; i<n; i++) {
			
			nArray[i]=scan.nextInt();
			++ansArray[nArray[i]-1];
			
		}
		
		for(int a:ansArray) {
			System.out.print(a+" ");
			
			
		}
	
		
		
		
	}

}
