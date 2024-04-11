package practice;

import java.util.Scanner;

public class ncrnpr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		
		int result=ncr(n)/(ncr(n-r)*ncr(r));
		System.out.println("ncr:" +result);
		int result1=ncr(n)/ncr(n-r);
		System.out.println("npr:" + result1);
		
	}
	private static int ncr(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
