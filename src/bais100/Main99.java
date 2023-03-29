package bais100;

import java.util.Scanner;

public class Main99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  scan =  new Scanner(System.in);
		int []start = new int [2];
		int [][] mazeArray=  new int [10][10]; 
		for(int i=0; i<10; i++) {
			for (int j=0; j<10; j++) 
				mazeArray[i][j]=scan.nextInt();
		}
		
		
		
	
		
		
		
		//
		
		  loop: for(int i=1; i<10; i++) { 
			  
			  for(int j=1+start[1]; j<10; j++)
			  {
		 
			  		if(mazeArray[i][j]==0){
			  				
			  			mazeArray[i][j]=9; 
			  			
			  		} 
			  		else if(mazeArray[i][j]==1){ 
			  			
			  			start[1]=j-2; 
			  			
			  			break; 
			  		} 
			  		else if(mazeArray[i][j]==2)
			  		{ 
			  			mazeArray[i][j]=9; 
			  			break loop; 
			  		} 
			  		
			  
			  
			  } 
			  
		  
		  
		  }
		 
		
		
		
			
		
		
		
		for(int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				
				
				System.out.print(mazeArray[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	}

}
