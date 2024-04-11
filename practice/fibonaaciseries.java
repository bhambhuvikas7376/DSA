package practice;

import java.util.Scanner;

public class fibonaaciseries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		int c=1;
		int count=2;
		
		while(count<=a)
		{
			int temp=c;
			c=c+b;
			b=temp;
			count++;
			System.out.println(c);
		}
		
		

	}

}
