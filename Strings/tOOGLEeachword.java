package Strings;

import java.util.Scanner;

public class tOOGLEeachword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split("\\s");
		int i=0;
		for(String s2:s1)
		{
			s2=s2.charAt(0)+s2.substring(1).toUpperCase();
			s1[i]=s2;
			i++;
		}
		
		s=s.join(" ", s1);
		System.out.println(s);
	}

}
