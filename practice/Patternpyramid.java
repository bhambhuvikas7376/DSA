package practice;

import java.util.Scanner;

public class Patternpyramid {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
