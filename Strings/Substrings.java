package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Substrings {

	public static void main(String[] args) {
		String A="BAT";
		String B="BATMAN";
		
		int[] order= {3,4,5};
		char[] arr=B.toCharArray();
		ArrayList<Character> list=new ArrayList<>();
		
		for(char a: arr)
		{
			list.add(a);
		}
	   System.out.println(list);
	    for(int i=0;i<order.length;i++)
	    {
	    	if(issubstring(A,B,list))
	    	{
	    		list.remove(order[i]);
	    	}
	    }
	    
	    System.out.println(list);
	
	
	}
	private static boolean issubstring(String A, String B, ArrayList<Character> list) {
		int m=A.length();
        int n=B.length();
        char[] a=A.toCharArray();

        Character[] arr = new Character[list.size()];
        arr = list.toArray(arr);
  
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==a[j])
            {
                j=j+1;
                
                if(m==j)
            	   break;
            }
        }
        
        if(m==j)
        {
        	return true;
        }
        return false;
        
      
		
	}
	
	

}
