package bais100;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Main18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		
		String a = scan.nextLine(); 
		String [] aray=a.split("\\."); 
		System.out.println(aray.length);
		
		System.out.format("%04d.%02d.%02d",Integer.valueOf(aray[0]),Integer.valueOf(aray[1]),Integer.valueOf(aray[2]));
	}

}
