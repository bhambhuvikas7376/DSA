package practice;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp=a;
		int sum=0;
		while(a>0)
		{
			int b=a%10;
			a=a/10;
			sum+=b*b*b;
		}
		
		if(sum==temp)
		{
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("not Armstrong");
		}

	}

}
