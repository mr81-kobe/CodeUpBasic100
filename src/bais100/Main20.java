package bais100;

import java.util.Scanner;

public class Main20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		
		String sNo = scan.next();
		  String [] array=sNo.split("-");
		  System.out.println(array[0]+array[1]);
	}

}
