package bais100;

import java.util.Scanner;

public class Main84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int r=scan.nextInt();
		int count =0;
		int g= scan.nextInt();
		int b =scan.nextInt();
		for(int i=0; i<r; i++) {
			
			for(int j=0; j<g;j++) {
				for(int k=0; k<b; k++) {
					System.out.println(i+" "+j+" "+k);
					count++;
				}
			}
			
			
		}
		System.out.println(count);
		
	}

}
