package bais100;

import java.util.Scanner;

public class Main97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		

		
		int [][] nArray = new int [19][19];
		
		
		for(int i=0; i<19; i++) {
			for(int j =0; j<19; j++) {
			
				nArray[i][j]=scan.nextInt();
			}
		}
		int n = scan.nextInt();
		int [][] aArray = new int[n][2]; 
		for(int i=0; i<n; i++) {
			aArray[i][0]=scan.nextInt();
			aArray[i][1]=scan.nextInt();
		}
		
		/////setting
		
		for(int j=0; j<19;j++) {
		for(int i=0; i<n;  i++) {
			
		nArray[aArray[i][0]-1][j]=nArray[aArray[i][0]-1][j]==1 ? 0:1;
		nArray[j][aArray[i][1]-1]=nArray[j][aArray[i][1]-1]==1 ? 0:1;
		}
	}
		
		for(int i=0; i<19; i++) {
			for(int j =0; j<19; j++) {
				
				
				
				
				System.out.print(nArray[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

}
