package practice;

import java.util.Scanner;

public class Patternno {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n,sum;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				sum=i+j;
				if(sum%2==0)
				{
					System.out.print("1"+" ");
				}
				else
					System.out.print("0"+" ");
			}
		System.out.println(" ");
	
		}
	}
}
