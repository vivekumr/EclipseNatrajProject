package com.pattern;


public class Number_increasingPyramidPattern {

//	1
//	22
//	333
//	4444
//	55555
//	666666
	public static void printPattern1(int n) {
		int i,j;
		
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	//1
	//12
	//123
	//1234
	//12345
	//123456
	public static void printPattern2(int n) {
		int i,j;
		
		for(i=1;i<=n;i++) {
			
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
//	123456
//	12345
//	1234
//	123
//	12
//	1
	
	public static void printPattern3(int n) {
		int i,j;
		for(i=n;i>=1;i--) {
			
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern3(6);
	}

}
