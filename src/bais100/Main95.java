package bais100;

import java.util.Scanner;

public class Main95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int min=23;
		
		int n = scan.nextInt();
		int [] nArray = new int [n];
		for(int i=0; i<n; i++) {
			
			nArray[i]=scan.nextInt();
			if(min>nArray[i])
				min=nArray[i];
		}	
			System.out.println(min);
		
		
	}

}
