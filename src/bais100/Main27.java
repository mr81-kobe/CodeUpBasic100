package bais100;

import java.util.Scanner;

public class Main27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a=new Scanner(System.in).nextLine(); 
		
		String [] s=a.split("\\.");

		
		for(int i=s.length-1; i>=0; i--) {
			
			if(i!=0) {
				System.out.format("%02d-",Integer.valueOf(s[i]));	
			}else {
				System.out.format("%d",Integer.valueOf(s[i]));
			}
			
			
			
			
		}
	}

}
