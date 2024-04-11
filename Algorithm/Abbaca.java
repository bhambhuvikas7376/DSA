package Algorithm;

import java.util.Stack;

public class Abbaca {

	public static void main(String[] args) {
		String str="";
		
		Stack<Character> s=new Stack<>();
		for(int i =0;i<str.length();i++)
		{
			Character c=str.charAt(i);
			if(s.isEmpty())
			{
				s.push(c);
			}
			else if ( notmatching(s.peek(),c))
			{
				s.pop();
			}
			else
			{
				s.push(c);
			}
		}
		
		System.out.println(s);

	}

	private static boolean notmatching(Character a,Character c) {
		// TODO Auto-generated method stub
		return a.equals(c);
	}

}
