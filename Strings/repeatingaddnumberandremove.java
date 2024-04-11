package Strings;
import java.util.*;

public class repeatingaddnumberandremove {

	public static void main(String[] args) {
		
		String s = "hello my name is vikas and my role is sd1";
		
		HashMap<String,Integer> map=new HashMap<>();
		
		String[] s1=s.split("\\s");
		
        for(String s2:s1)
        {
        	if(map.containsKey(s2))
        	{
        		int val=map.get(s2);
        		map.put(s2, val+1);
        	}
        	else
        	{
        		map.put(s2, 1);
        	}
        }
        HashSet<String>  set=new HashSet<>();
        String snew="";
        
        
        for(int i=0;i<s1.length;i++)
        {
        	if(map.get(s1[i])>=1 && !set.contains(s1[i]))
        	{
        		set.add(s1[i]);
        		snew=snew+s1[i]+map.get(s1[i])+" ";
        	}
        	else
        	{
        		set.add(s1[i]);
        	}
        	
        }
        
        
        snew.trim();        
        System.out.println(snew);
     
          
	}

}
