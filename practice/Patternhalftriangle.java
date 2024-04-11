/*package practice;

import java.util.Scanner;

public class Patternhalftriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j =1;j<=i;j++)
				// inverted half pyramid
				// for(int j=1;j<=n-i+1;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}		
			
		}

	}*/



//  inverted half pyramid

package practice;

import java.util.Scanner;

public class Patternhalftriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}		
			
		}

	}


