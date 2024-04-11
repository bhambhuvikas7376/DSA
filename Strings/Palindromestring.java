package Strings;
import java.util.*;
public class Palindromestring {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String s=sc.next();
		char[] ar=s.toCharArray();
		
		Stack<Character> st=new Stack<Character>();
		
		for(int i=ar.length-1;i>=0;i--)
		{
			st.push(ar[i]);
		}
		
		for(int j=0;j<ar.length;j++)
		{
			st.push(ar[j]);
		}
		
		int size=st.size();
		for(int i=0;i<size;i++)
		{
			System.out.print(st.pop());
			
		}
          
	}

}
