package bais100;

import java.util.Scanner;

public class Main92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Long a=scan.nextLong();
		int b=scan.nextInt();
		int c=scan.nextInt(); 
		int day =1;
		
		
		while(true) {
			if(day%a==0&&day%b==0&&day%c==0) {
				System.out.println(day);
				break;
			}
			
			day++;
			
			
		}
		
		
		
		
	}

}
