package practice;

import java.util.Scanner;

public class patterndiamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		
			//space
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("*");
			}
		   
//			for(int j=2;j<=i;j++)
//			{
//				System.out.print("*");
//			}
			System.out.println("");
			
		}
		for(int i=n;i>=1;i--)
		{
		
			//space
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			for(int j=2;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			
		}	

	}

}
