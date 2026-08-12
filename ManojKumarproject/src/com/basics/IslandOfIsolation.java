package com.basics;

class A {
	B b;
}

class B {
	A a;
}

public class IslandOfIsolation {
	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}

	public static void main(String[] args) {
		System.out.println("main method strated");
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.b = obj2;
		obj2.a = obj1;
		obj1=null;
		obj2=null;
		System.gc();
		System.out.println("main method ended");

		
	}

}
