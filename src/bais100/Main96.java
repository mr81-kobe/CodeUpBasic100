package bais100;

import java.util.Scanner;

public class Main96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		
		
		
		int n = scan.nextInt();
		int [][] nArray = new int [19][19];
		int [][] aArray=new int[n][2];
		
		for(int i=0; i<19; i++) {
			for(int j =0; j<19; j++) {
			
				nArray[i][j]=0;
			}
		}
		
		
		
		
		for(int i=0; i<n; i++) {
			
				aArray[i][0]=scan.nextInt();
				aArray[i][1]=scan.nextInt();
				nArray[(aArray[i][0])-1][aArray[i][1]-1]=1; 

		}
		
		for(int i=0; i<19; i++) {
			for(int j =0; j<19; j++) {
				System.out.print(nArray[i][j]+" ");
				
			}
			System.out.println();
		}
	
	
	
	}

}
