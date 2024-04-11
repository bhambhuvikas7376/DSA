package practice;

interface A{
	void show(int i);
}

public class Interfaces {

	public static void main(String[] args) {
		
		A obj= (i) -> System.out.println("Hello word"+ i);
		obj.show(6);
	
	}

}
