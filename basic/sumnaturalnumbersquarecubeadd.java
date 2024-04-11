package basic;

import java.util.Scanner;

public class sumnaturalnumbersquarecubeadd {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0,sum1=0,sum2=0;
		
		for(int i=1;i<=n;i++)
		{
			
			sum+=i;
			 sum1 +=i*i;
			 sum2 +=i*i*i;
			
		}
	   System.out.print(sum+" "+sum1+" "+sum2+" ");
	}

}
