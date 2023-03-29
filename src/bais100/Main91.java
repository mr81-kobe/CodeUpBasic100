package bais100;

import java.util.Scanner;

public class Main91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Long a=scan.nextLong();
		int m=scan.nextInt();
		int d=scan.nextInt(); 
		int n=scan.nextInt(); 
		Long result=0L;
	
	for(int i=0; i<n-1; i++) {
		
		
		a = a*m+d;
		
	}
	
	System.out.println(a);
	
	}

}
