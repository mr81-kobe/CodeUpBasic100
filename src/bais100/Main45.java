package bais100;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] s = new Scanner(System.in).nextLine().split(" ");
		
	
		
		
		System.out.format("%d",(Integer.parseInt(s[0])+Integer.parseInt(s[1])+Integer.parseInt(s[2])));
		System.out.println();
		System.out.format("%.1f",(float)(Integer.parseInt(s[0])+Integer.parseInt(s[1])+Integer.parseInt(s[2]))/3);
		
	}

}
