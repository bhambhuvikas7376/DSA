package basic;

import java.util.Scanner;

public class Countingoccurence {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter a input: ");
			int n =sc.nextInt();
			if(n==1||n==2)
			{
				n+=2;
			}
			else if(n==44)
				break;
			System.out.println(n);
		}
		
		
		
		

	}

}
