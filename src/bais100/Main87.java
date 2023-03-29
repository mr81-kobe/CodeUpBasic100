package bais100;

import java.util.Scanner;

public class Main87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = new Scanner(System.in).nextInt();
		int count=0; 
		int sum =0;
		while(true) {
			sum+=count;
			count++;
			if(sum>=a) {
				System.out.println(sum);
				
				break;
			}
			
			
			
		}
		
	}

}
