package basic;

import java.security.InvalidAlgorithmParameterException;

public class trycatch {

	public static void main(String[] args) {
		try {
			foo("hello");
			String s="""
						hello""";
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void foo(String i) throws IllegalArgumentException, NullPointerException {
		System.out.println(i.toUpperCase());
		
		
	}
	
	

}
