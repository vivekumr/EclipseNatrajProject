package logicalProgram;

public class LP005_ReverseAString_recursive2 {

	public static void main(String... args) {
		String input ="Hello word";
		String reversed=reverseString(input);
		System.out.println("RESULT :: "+reversed);
	}
	
	public static String reverseString(String str) {
		if(str.isEmpty()) {
			return str;
		}
		else {
			return reverseString(str.substring(1)+ str.charAt(0));
		}
	}
}
