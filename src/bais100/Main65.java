package bais100;

import java.util.Scanner;

public class Main65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		
		for(int i=0; i<3; i++) {
			if(scan.nextInt()%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			
		}
		  
		
	}

}
