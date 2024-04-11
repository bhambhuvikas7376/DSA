package Algorithm;

import java.util.Stack;

public class Validparentesis {

	public static void main(String[] args) {
		String str="(({}])";
		System.out.println(ismatchingparenthesis(str));
	}

	private static boolean ismatchingparenthesis(String str) {
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			 if(isopening(c))
			 {
				s.push(c); 
			 }
			 else
			 {
				 if(s.isEmpty())
				 {
					 return false;
				 }
				 
			   else if(!matching(s.peek(),c))
				 {
					 return false;
				 }
				 else {
					 s.pop();
				 }
			 }
		}
		return s.isEmpty();
	}

	private static boolean matching(Character a, char c) {
		
		return (a=='(' && c==')')||(a=='{' && c=='}')||(a=='[' && c==']');
	}

	private static boolean isopening(char c) {
		
		return c=='('||c=='{'||c=='[';
	}

}
