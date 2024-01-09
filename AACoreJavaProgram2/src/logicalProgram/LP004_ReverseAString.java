package logicalProgram;

public class LP004_ReverseAString {

	public static void main(String... args) {
		String input ="Hello word";
		String reversed=reverseString(input);
		System.out.println("RESULT :: "+reversed);
	}
	
	public static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}
}
