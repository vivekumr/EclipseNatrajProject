package oops;

public class Test3 {

	public void methodOne(int n) {
		System.out.println("int-args method");
	}
	public void methodOne(float fl) {
		System.out.println("float-args method");
	}
	public void methodOne(String str) {
		System.out.println("string-args method");
	}
	public static void main(String[] args) {
		Test3 t1=new Test3();
		t1.methodOne('a');
		t1.methodOne("string");
		t1.methodOne(101F);
		//t1.methodOne(101.9);
	}

}
