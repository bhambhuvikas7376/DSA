package practice;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a%2==0)
	{
		System.out.println("number is even:"+a);
	}else
	{
		System.out.println("number is odd:"+a);
	}
	}

}
