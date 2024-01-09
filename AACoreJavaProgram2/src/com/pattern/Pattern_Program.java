package com.pattern;

public class Pattern_Program {
	public static void squarePattern(int n) {
		/*
*****
*****
*****
*****
*****
		 */
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	public static void pyramidPattern(int n){
		/*
	    * 
	   * * 
	  * * * 
	 * * * * 
	* * * * * 
	 */
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	public static void pattern2(int n){
		/*
   * 
   * * 
   * * * 
   * * * * 
   * * * * * 
	*/
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}
	public static void rightTrianglePattern3(int n){
		/*
   
    
	*/
	for(int i=0;i<n;i++) {
		
		for(int j=0;j<n-i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("*");	
		}
		
		System.out.println();
	}
	}
	public static void leftDownTriangle(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	public static void hollowSquarePattern(int n) {
		/*
*****
*   *
*   *
*   *
*****
		 
		 */
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				if( i==0 || i==n-1) {
					System.out.print("*");
				}
				else {
					if(j== 0|| j== n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
				
			
			System.out.println();
		}
		
	}
	public static void rightDownTriangle(int n) {
		for(int i=0;i<n;i++) {
		      for (int j = 0; j < i; j++) {
		          System.out.print(" ");
		        }
		        // print stars
		        for (int j = n; j > i; j--) {
		          System.out.print("*");
		        }

				System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; 
		rightDownTriangle(n); 
	}

}
