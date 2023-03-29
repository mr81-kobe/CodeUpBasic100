package bais100;

import java.util.Scanner;

public class Main80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);  
		
		int a= scan.nextInt(); 
		int sum=0;
		int count=0;
		
		while(true) {
			sum=sum+count; 
			if(sum<a) {
				count++;
				}else {
				System.out.println(count);
				break;
			}
			
			
			
			
		}
		
	}

}
