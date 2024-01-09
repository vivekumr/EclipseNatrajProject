package java8Feature;

public class Test4_Impl_without_lemda implements Interf4 {

	@Override
	public int squreIt(int x) {
		return x*x;
	}
	public static void main(String[] args) {
		Interf4 i= new Test4_Impl_without_lemda();
		System.out.println(i.squreIt(5));
		System.out.println(i.squreIt(7));
	}
}
