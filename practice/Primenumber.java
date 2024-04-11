package practice;

import java.util.Scanner;

public class Primenumber {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
		
	}

	private static boolean isPrime(int i) {
		if(i==0 || i==1)
			return false;
		for(int j=2;j*j<=i;j++)
		{
			if(i%j==0)
				return false;
		}
		return true;
		
	}
}
