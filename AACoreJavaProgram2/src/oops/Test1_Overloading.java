package oops;

public class Test1_Overloading {

	public void methodTest() {
		System.out.println("no-arg method");
	}
	public void methodTest(int num) {
		System.out.println("int-arg method");
	}
	public void methodTest(double d) {
		System.out.println("double-arg method");
	}
	
	public static void main(String [] args) {
		Test1_Overloading t1=new Test1_Overloading();
		t1.methodTest();
		t1.methodTest(10);
		t1.methodTest(89d);
	}
}
