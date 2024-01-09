package java8Feature;

public class Test2 {

	public static void main(String[] args) {
		Interf2 i=(a,b)->System.out.println("The sum by lemda expersion " +(a+b));
		i.add(10, 100);
		i.add(12,70);
	}

}
