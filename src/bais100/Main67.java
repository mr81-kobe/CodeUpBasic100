package bais100;

import java.util.Scanner;

public class Main67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		 
		Long a = scan.nextLong();
		
		if(a*-1>0) {
			System.out.println("minus");
		}else {
			System.out.println("plus");
		}
		
		if(a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		
	}

}
