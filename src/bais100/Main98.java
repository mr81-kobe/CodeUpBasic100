package bais100;

import java.util.Scanner;

public class Main98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//바둑판 가로세로 길이 
		int w = scan.nextInt();
		int h=scan.nextInt();
		//바둑판 and 바둑판 세팅 
		int [][] pan = new int [w][h]; 
		for(int i=0; i<w; i++) {
			for(int j=0; j<h; j++) {
				pan[i][j]=0;
			}
		}
		//막대 개수 
		int n = scan.nextInt();
		
		
		//길이 방향 좌표 배열 세팅 
		int [][] infoArray = new int [n][4];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<4; j++) {
				infoArray[i][j]=scan.nextInt();
			}
		}
		
		
		
		for(int i=0; i<w; i++) {
			for(int j=0; j<h; j++) {
				for(int k=0; k<n; k++) {
					
						
					pan[infoArray[k][2]-1][infoArray[k][3]-1]=1; 
					if(infoArray[k][1]==0) {
						for(int q=0; q<infoArray[k][0]; q++) {
						pan[infoArray[k][2]-1][infoArray[k][3]-1+q]=1;
						}
					
					}else {
						for(int q=0; q<infoArray[k][0]; q++) {
							pan[infoArray[k][2]-1+q][infoArray[k][3]-1]=1;
						}
					}
						
					
				}
				
			}
			
		}
			
			
		for(int i=0; i<w; i++) {
			for(int j=0; j<h; j++) {
				System.out.print(pan[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
