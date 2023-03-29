package bais100;

import java.util.Scanner;

public class Main82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		int a= Integer.parseInt(s,16); 
		
		for(int i=1; i<=Integer.parseInt("F",16); i++)
			{
			System.out.format("%X*"+"%X"+"="+"%X",a,i,a*i);
			System.out.println();
			}
		
		
	}

}
