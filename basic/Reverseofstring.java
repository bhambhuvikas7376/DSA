package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Reverseofstring {

	public static void main(String[] args) {
//		String str="geeks";
//		StringBuilder sb=new StringBuilder();
//		sb.append(str);
//		sb.reverse();
//		System.out.println(sb);
		String str="geeks";
		String str2="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			str2=ch+str2;
		}
		System.out.println(str2);
		
	}

}
