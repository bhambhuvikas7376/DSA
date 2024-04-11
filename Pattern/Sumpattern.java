package Pattern;

import java.util.*;

public class Sumpattern {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0;
		int s=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<(2*i);j++)
			{
			    if(j%2!=0)
			    {
			    	s=s+1;
			    	System.out.print(s);
			    }
			    else
			    {
			    	System.out.print("+");
			    }
			}
			s=0;
			System.out.print("=");
			sum=sum+i;
			System.out.print(sum);
			System.out.println();	
		}

	}

}
