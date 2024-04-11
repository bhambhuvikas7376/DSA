package practice;

import java.util.Scanner;

public class Hiver {
	static int soldiers(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return(soldiers(n-1, k)+ k- 1)% n+1;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("number of soldiers in  camp");
	     int n=input.nextInt();
	     System.out.println("number of soldiers to be killed");
	     int k=input.nextInt();
	     System.out.println(soldiers(n, k));
	}

}
