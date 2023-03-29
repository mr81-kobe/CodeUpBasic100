package bais100;

import java.util.Scanner;

public class Main90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int r=scan.nextInt();
		int n=scan.nextInt(); 
		Long b=1L;
	//a*rn-1제곱 
		

		for(int i=0; i<n-1; i++) {
			
			b=b*r;
		}
		System.out.println(a*b);
	}

}
