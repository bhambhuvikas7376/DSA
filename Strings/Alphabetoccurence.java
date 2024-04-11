package Strings;

import java.util.HashMap;
import java.util.Set;

public class Alphabetoccurence {

	public static void main(String[] args) {
		String s="abc_$AdEcB%*a";
		s.toLowerCase();
		
		
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
		     if(map.containsKey(s.charAt(i)))
		     {
		    	int val=map.get(s.charAt(i)) ;
		    	map.put(s.charAt(i), val+1);
		     }
		     else
		     {
		    	 map.put(s.charAt(i),1);
		     }
			}
		}
		
		
		Set<Character> it=map.keySet();
		
		for(Character key:it)
		{
			System.out.print(key+":"+map.get(key)+",");
		}
		

	}

}
