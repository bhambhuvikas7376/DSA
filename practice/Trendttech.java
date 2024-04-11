package practice;

import java.util.Scanner;

public class Trendttech {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int p=sc.nextInt();
//		
//		for(int i=1;i<=n;i++)
//		{
//			int[] pass=new int[50];
//			pass[0]=i*5000;
//			if(pass[0]==p)
//			{
//				System.out.println(i);
//			}
//			
//			for(int j=1;j<=49;j++)
//			{
//				pass[j]=pass[j-1]+5000+j;
//				
//				if(pass[j]==p)
//				{
//					System.err.println(j+1);
//				}
//			}
//			
//		}
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pass=sc.nextInt();
		int as,i,x=0;
		as=pass;
		int day=pass%1000;
		
		for(i=0;i<day;i++)
		{
			as-=i;
			x+=i;
			if(x==day)
			{
				break;
			}
		}
		
		as-=5000*(i);
		as/=5000;
		System.out.println(as);
		//System.out.println(i+1);
		
	}

}
