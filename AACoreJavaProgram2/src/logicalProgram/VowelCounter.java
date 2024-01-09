package logicalProgram;

import java.util.Scanner;

public class VowelCounter {
		
	public VowelCounter(){
		super();
	}
	public static void main(String[] args) {
		System.out.println("Enter Some Text :: ");
		Scanner reader=new Scanner(System.in);
		
		String input=reader.nextLine();
		
		char ch[] =input.toCharArray();
		
		int count=0;
		
		for(char c:ch) {
			//1st Option
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				count++;
			}
			
			//2nd Option
	/*		switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
					count++;
					
				break;
				default:
			}*/
		}
		System.out.println("Count :: "+count);
	}
}
