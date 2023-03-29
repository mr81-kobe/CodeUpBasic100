package bais100;

import java.util.Scanner;

public class Main42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = new Scanner(System.in).nextLine();
		String [] sa =s.split(" ");
		
		System.out.format("%d",(Long.parseLong(sa[0])/Long.parseLong(sa[1])));
		
		
	}

}
