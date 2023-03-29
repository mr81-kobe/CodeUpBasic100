package bais100;

import java.util.Scanner;

public class Main78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int sum=0;
		
		int a = scan.nextInt();
		while(a!=0)
		{
			if(a%2==0)
				sum+=a;
			a--;
			
			
		}
		System.out.println(sum);
		
	}

}
