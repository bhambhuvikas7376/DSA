package basic;

public class Hello {

	public static void main(String[] args) {

			 B obj = new B();

			System.out.println("value o f a = "+obj.a);
			obj.m1();

	}

}

class A{
	 int a = 0;

	 public void m1(){
	  System.out.println("I am in A");
	 }
	}

	class B extends A{
	 int a = 2;

	 public void m1(){
	  System.out.println("I am in B");
	 }

	}


