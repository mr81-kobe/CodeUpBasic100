package bais100;

import java.util.Scanner;

public class Main85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Long h=scan.nextLong();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int s=scan.nextInt();
		Long result=h*b*c*s;
		System.out.format("%.1f MB",result/8.0/1024/1024);
		
	}

}
