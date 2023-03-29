package bais100;

import java.util.Scanner;

public class Main86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Long h=scan.nextLong();
		int b=scan.nextInt();
		int c=scan.nextInt(); 
			
		
		
		System.out.format("%.2f MB",(h*b*c)/8.0/1024/1024);
		
		
		
		
	}

}
