package basic;

import java.util.Scanner;

public class pattern {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int c=i+j;
					if(c%2==0)
							{
						System.out.print("1");
							}
					else
					{
						System.out.print("0");
					}
				}
			System.out.println();

			
		}
	}

}
