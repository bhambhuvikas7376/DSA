package basic;

import java.util.Scanner;

public class trim {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().trim().charAt(2);
		
		System.out.println(ch);

	}

}
