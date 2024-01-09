package oops;

public class Test4 {

	public void methodOne(String str) {
		System.out.println("String-args method");
	}
	public void methodOne(Object o) {
		System.out.println("Object method");
	}
	public static void main(String [] args) {
		Test4 t4=new Test4();
		t4.methodOne("str");
		t4.methodOne(new Object());
		t4.methodOne(null);
	}
}
