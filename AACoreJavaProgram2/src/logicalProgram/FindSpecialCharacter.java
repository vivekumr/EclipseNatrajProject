package logicalProgram;

public class FindSpecialCharacter {

	public static void main(String[] args) {
		String s="vivek1 kumar@#!";
		int count=0;
		String specialCharacterRemoved="";
		for(int i=0;i<s.length();i++) {
			//System.out.println(s.charAt(i));
			if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)) || Character.isWhitespace(s.charAt(i))){
				specialCharacterRemoved=specialCharacterRemoved+s.charAt(i);
			}
			else {
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("there is no Special Character ");
		}
		else {
			System.out.println("Special character Found "+count);
		}
		System.out.println("Without Special Character "+specialCharacterRemoved);
	}
}