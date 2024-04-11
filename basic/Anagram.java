package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram                                                                                                                                  {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		char[] s1=str1.toLowerCase().toCharArray();
		char[] s2=str2.toLowerCase().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		System.out.println(Arrays.toString(s1));
		boolean s = Arrays.equals(s1, s2);
		
		if(s)
		{
			System.out.println("anagrams");
		}
		else
		{
			System.out.println("are not anagrama");
		}
	}

}
