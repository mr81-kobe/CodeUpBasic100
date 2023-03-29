package bais100;

import java.util.Scanner;

public class Main25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count =10000;
		int a = scan.nextInt(); 
		int temp =0;
		while(!(count<1)) {
			
			 
			
			 System.out.println("["+(a/count)*count+"]");
			a=a-(a/count)*count;
			
			count = count/10;
			
		}
	}

}
