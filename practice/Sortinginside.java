package practice;

import java.util.Arrays;
import java.util.ArrayList;
public class Sortinginside {

	public static void main(String[] args) {
		String[] arr={"vikas","ksvia","vuarjy","chankit","yuvraj","satish","shanu"};
		int n=arr.length;
		 ArrayList<String> list =new ArrayList<String>();
		 for(int i=0;i<n;i++)
		 {
			 list.add(arr[i]);
		 }
	   
		for(int i=0;i<n;i++)
		{
			String  s=arr[i];
			char[] ch=s.toCharArray();
			Arrays.sort(ch);
			String s1=new String(ch);
			arr[i]=s1;
		}
		System.out.println(list);
		System.out.println(Arrays.toString(arr));
		
		 
		for(int i=0;i<list.size();i++)
		{
			
			for(int j=i+1;j<list.size();j++)
			{
				if((arr[i]).equals(arr[j]))
				{	
					list.remove(j);
				    continue;
				    
				}
				
			}
		}
		System.out.println(list);
	     Object[] arr2=list.toArray();
	     System.out.println(Arrays.toString(arr2));
	     
	}

}
