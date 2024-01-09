package logicalProgram;

import java.util.Scanner;

public class CharCountVowelCounter {

	public static void main(String [] args) {
		System.out.println("Enter the String :: ");
		
		Scanner scn=new Scanner(System.in);
		String input=scn.nextLine();
		char[] ch=input.toCharArray();
		int aCount=0;
		int eCount=0;
		int iCount=0;
		int oCount=0;
		int uCount=0;
		
		for(char c: ch) {
			
			if(c=='A'||c=='a') {
				aCount++;
			}
			else if (c=='E'||c=='e') {
				eCount++;
			}
			else if (c=='I'||c=='i') {
				iCount++;
			}
			else if (c=='O'||c=='o') {
				oCount++;
			}
			else if (c=='U'||c=='u') {
				uCount++;
			}
	
		}//forEach
		
		System.out.println("A :: "+aCount);
		System.out.println("E:: "+eCount);
		System.out.println("I :: "+iCount);
		System.out.println("O :: "+oCount);
		System.out.println("U :: "+uCount);
	}
	
}
