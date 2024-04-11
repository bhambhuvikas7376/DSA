package Pattern;

import java.util.*;

public class Reversehalftriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		
		for(int i=1;i<n;i++)
		{
			System.out.print("* ");
			for(int j=0;j<n-(i+2);j++)
			{
				System.out.print("  ");
			}
			if(i<n-1)
			{
			System.out.println("* ");
			}
		}
		
	}

}
