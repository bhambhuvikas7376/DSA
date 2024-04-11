package Pattern;

import java.util.*;

public class Oddpattern {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=1;
		int s=1;
		int sum1=1;
		int s1=1;
		for(int i=1;i<n;i++)
		{
			s+=2;
			sum+=s;
		}
		for(int i=1;i<=(2*n)-1;i+=2)
		{
			for(int j=i;j<sum;j+=2)
			{
				
				System.out.print(j);
				if(j==(2*n)-1)
				{
					j=-1;
				}
				s1+=2;
				sum1+=s1;
				if(sum1>sum)
				{
					break;
				}
			}
			s1=0;
			sum1=1;
			System.out.println();
		}	
		
	}

}
