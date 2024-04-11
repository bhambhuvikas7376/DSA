package basic;

import java.util.Scanner;

public class fibonaccinumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		System.out.print(a);
		for(int i=0;i<n;i++)
		{
			int temp =b;
			b = b+a;
			a =temp;
			System.out.print(b+ " ");
			
		}
		
		
	}

}
