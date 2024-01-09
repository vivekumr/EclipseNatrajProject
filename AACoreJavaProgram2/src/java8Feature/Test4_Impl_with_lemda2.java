package java8Feature;

public class Test4_Impl_with_lemda2{

	public static void main(String[] args) {
		Interf4 i= o->(o*o);
		System.out.println(i.squreIt(5));
		System.out.println(i.squreIt(7));
	}
}
