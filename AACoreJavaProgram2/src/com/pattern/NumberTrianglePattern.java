package com.pattern;

public class NumberTrianglePattern {
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
//6 6 6 6 6 6
	public static void printPattern(int n) {
		
		int i,j;
		//outr loop to handle number of rows
		for(i=1;i<=n;i++) {
			//inner loop to print space
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPattern(6);
	}

}
