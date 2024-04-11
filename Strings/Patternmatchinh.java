package Strings;

public class Patternmatchinh {

	public static void main(String[] args) {
		String s="hellohello";
		String s1="el";
		
//		if(s.contains(s1))
//		{
//			System.out.println("yes");
//		}
//		else
//		{
//			System.out.println("no");
//		}
		int count=0;
		boolean b=false;
		for(int i=0;i<=s.length()-s1.length();i++)
		{
			if(s.charAt(i)==s1.charAt(0))
			{
				for(int j=i,k=0;j<i+s1.length();j++,k++)
				{
					if(s.charAt(j)==s1.charAt(k))
					{
						count++;
						if(count==s1.length())
						{
							b=true;
						}
					}
				}
			}
		}
		System.out.println(count);
		
		if(b)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
