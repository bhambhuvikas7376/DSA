package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String[] s1=s.split("\\s");
		int i=0;
		for(String s2:s1)
		{
			s2=reverse(s2);
			s1[i]=s2;
			i++;
		}
		s=s.join(" ",s1);
		System.out.println(s);
	}

	private static String reverse(String s2) {
		String s="";
		
		for(int i=s2.length()-1;i>=0;i--)
		{
			s=s+s2.charAt(i);
		}
		
		return s;
		
	}

}
