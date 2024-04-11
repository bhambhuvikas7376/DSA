package Algorithm;
import java.util.*;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			s1=s1+c[i];
		}
	
		if(s.equals(s1))
		{
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("string is not palindrome");
		}
		
		

	}

}
