package bais100;

import java.util.Scanner;

public class Main68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		 
		Long a = scan.nextLong();
		
		System.out.println(a>=90 ? "A" : a>=70&&a<90 ? "B" : a>=40 && a<70 ? "C" :"D");
		
	}

}
