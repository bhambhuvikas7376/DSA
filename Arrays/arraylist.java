package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		 ArrayList<Integer> arr1 = new ArrayList<Integer>(5);  
	        
	        arr1.add(1);  
	        arr1.add(1);
	        arr1.add(3);  
	        arr1.add(2); 
	        arr1.add(1);
	        
	        Integer a=Collections.max(arr1)+1;
	        
	        ArrayList<Integer> arr2=new ArrayList<Integer>(a);
	       for(int i =0;i<a;i++)
	       {
	    	   arr2.add(0);
	       }

	        
	       for(int i=0;i<arr1.size();i++)
	        {
	        	Integer v=arr2.get(arr1.get(i));
	        	v+=1;
	        	arr2.set(arr1.get(i), v);
	        	
	        }
	        
	        System.out.println(Arrays.toString(arr2.toArray()));
	}

}
