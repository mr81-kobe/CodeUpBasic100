package bais100;

import java.util.Scanner;

public class Main76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		
		int a =(int)scan.nextLine().charAt(0);
		//97이 a다 
		int min =97;
		
		while(min<=a) {
			if(min!=a)
				System.out.print((char)min+" ");
			else
				System.out.print((char)min);
			
			++min;
			
		}
		
	}

}
