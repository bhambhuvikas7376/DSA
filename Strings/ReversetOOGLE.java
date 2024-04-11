package Strings;

import java.util.Scanner;

public class ReversetOOGLE {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s=sc.nextLine();
			String[] s1=s.split(" ");
			int i=0;
			for(String s2:s1){
				s2=reverse(s2);
				char ch=s2.charAt(0);
				s2=ch+s2.substring(1).toUpperCase();
				s1[i]=s2;
				i++;
			}
			
			s=String.join(" ",s1);
			System.out.println(s);
		}
		

	}
       private static String reverse(String s2)
       {
    	   String s="";
    	   for(int i=s2.length()-1;i>=0;i--)
    	   {
    		   s=s+s2.charAt(i);
    	   }
    	   return s;
       }
}
