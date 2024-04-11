package Pattern;

import java.util.Scanner;

public class Halfpyramid {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				System.out.println("0");
			}
			else
			{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
			}
		  /*for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<i+1;j++)
			  {
				  System.out.print(i+1);
			  }
			  System.out.println();	
		  }*/
		  /*for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<i+1;j++)
			  {
				  char ch=(char)('A'+i);
				  System.out.print(ch);
			  }
			  System.out.println();
			  
		  }*/
		  /*for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<i+1;j++)
			  {
				  char ch=(char)('A'+i+j);
				  System.out.print(ch+" ");
			  }
			  System.out.println();
		  }*/
		  /*for(int i=n-1;i>=0;i--)
		  {
			  for(int j=0;j<n-i;j++)
			  {
				  char ch=(char)('A'+i+j);
				  System.out.print(ch+" ");
			  }
			  System.out.println();
		  }*/
	}

	}
}
