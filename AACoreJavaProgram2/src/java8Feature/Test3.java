package java8Feature;

public class Test3 {

	public static void main(String[] args) {
		Interf3 i= s->s.length();
		System.out.println(i.getLength("Hello"));
		System.out.println(i.getLength("With Lemda expersion"));
	}
}
