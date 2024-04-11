package OOPS;

interface I{
	void foo();
}

class a implements I{
	public void foo() {};
}

class b implements I{
	public void foo() {};
}

class C extends a, b{ // won't compile
	public void C() {
		super.foo();
	}
}

public class Inherritance {

	public static void main(String[] args) {
		

	}

}
