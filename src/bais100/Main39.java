package bais100;

import java.util.Scanner;

public class Main39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		
		String s = scan.nextLine(); 
		
		String [] s2=s.split(" ");
		System.out.println(Long.parseLong(s2[0])+Long.parseLong(s2[1]));
		
	}

}
