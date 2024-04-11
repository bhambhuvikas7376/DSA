package Strings;
import java.util.*;

public class Firstcharacteruppercase {

	public static void main(String[] args) {
	    ArrayList<String> list=new ArrayList<>();
	    list.add("vikas bhambhu");
	    list.add("rahul khaleri");
	    list.add("hello world hello word");
	    System.out.println(list);
	    
	    int j=0;
	    for(String s:list)
	    {
	    	
                
	    	if(s.length()>0)
	    	{ 
	    		if(s.contains(" "))
	    		{
	    		String snew="";
	    		String[] s1=s.split(" ");
	    		for(int i=0;i<s1.length;i++)
	    		{
	    			char firstChar = Character.toUpperCase(s1[i].charAt(0));
	    			s1[i] = firstChar + s1[i].substring(1);
                    snew=snew+s1[i]+" ";
                    snew.trim();
	    		}
	    		list.set(j,snew.trim());
	    		}
	    		else
	    		{
	                    char firstChar = Character.toUpperCase(s.charAt(0));
	                    s = firstChar + s.substring(1);
	    	    }
	    			j++;
	    	}
	        

	    }
	    
	    System.out.println(list);
	}

	
}
