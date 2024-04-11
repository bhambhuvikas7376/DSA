package basic;

public class Additionof2bytevariables {

	public static void main(String[] args) {
		//int a=1;
		//int b=2;
		//int c=a+b; 
		// c=3
		
		byte a=1;
		byte b=2;
		
		//byte c =a+b;   + apply minimum on int automatically covert into int 
		byte d = (byte)(a+b);
		System.out.println(d);
		
	}

}
