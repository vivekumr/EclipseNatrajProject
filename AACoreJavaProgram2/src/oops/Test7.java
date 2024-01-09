package oops;

//While overriding if the child class method throws any checked exception compulsory the 
//parent class method should throw the same checked exception or its parent otherwise we 
//will get compile time error.

public class Test7 {
	class Parent {
		public void methodOne() throws Exception {
		}
	}

	class Child extends Parent {
		public void methodOne() throws Exception {
		}
	}
}