package Pattern;

import java.util.*;
import java.util.Scanner;

public class Hollowhalfpyramid {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	
	System.out.println(1);
	for(int i=1;i<n-1;i++)
	{
		System.out.print("1");
		for(int j=0;j<=i-2;j++)
		{
			System.out.print(" ");
		}
		System.out.println(i+1);
	}
	for(int k=0;k<n;k++)
	{
		System.out.print(k+1);
	}

	}
}
