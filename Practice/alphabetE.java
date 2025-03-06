package Practice;

import java.util.Scanner;
public class alphabetE {
	public static void drawE(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				if(j==1||i==1||i==size||i==(size/2)+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		drawE(size);
		sc.close();
	}
}
