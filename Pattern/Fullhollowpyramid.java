package Pattern;

import java.util.*;

public class Fullhollowpyramid {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			System.out.print(" ");
		}
		System.out.println("1");
		
		for(int i=1;i<n-1;i++)
		{
			for(int j=0;j<n-(i+1);j++)
			{
				System.out.print(" ");
			}
			System.out.print("1");
			
			for(int k=0;k<2*i-1;k++)
			{
				System.out.print(" ");
			}
			
			System.out.println(i+1);
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(i+1+" ");
		}
		System.out.println();
	}

}
