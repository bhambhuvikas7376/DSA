package Arrays;

import java.util.*;
import java.io.*;

public class Frequencyofnumbers {

	public static void main(String[] args) {
		int[] a = {1, 3, 3, 4, 1, 4, 4, 4, 4};
        int n = a.length;
        int m=5;
        int[] a1=new int[m];
        
        for(int i=0;i<n;i++)
        {
        	a1[a[i]]++;
        }
        
        int s=0;
        for(int i=0;i<m;i++)
        {
        	if(a1[i]==0)
        	{
        		s++;
        		continue;
        	}
        	else
        	{
        	System.out.print("Number:"+s+"   "+"Frequency:"+a1[i]);
        	System.out.println();
        	s++;
        	}
	    }
        
         /*HashMap<Integer,Integer> map=new HashMap<>();
          for(int i=0;i<n;i++)
          {
        	  if(map.containsKey(a[i]))
        	  {
        		  int value=map.get(a[i]);
        		  map.put(a[i], value+1);
        	  }
        	  else
        	  {
        		  map.put(a[i],1);
        	  }
          }
          
          for(Integer key:map.keySet())
          {
        	  System.out.println(key+" "+map.get(key));
          }*/

	}

}
