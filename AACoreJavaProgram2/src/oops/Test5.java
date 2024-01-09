package oops;

public class Test5 {

	public void methodOne(String s) {
		System.out.println("String method");
	}
	
	public void method (StringBuffer sb) {
		System.out.println("StringBuffer method");
	}
	public static void main(String[] args) {
		Test5 t=new Test5();
		t.methodOne("msg");
		t.method(new StringBuffer("sai"));
		t.method(null);
	}
}
