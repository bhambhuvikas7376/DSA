package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class missingnumberinarrays {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    int[] ar=new int[n-1];
	    //ar[1,3,4]
	    
	    for(int i=0;i<ar.length;i++)
	    {
	    	ar[i]=sc.nextInt();
	    }
	    
	    HashSet<Integer> set=new HashSet<>();
	    for(int i=0;i<ar.length;i++)
	    {
	    	set.add(ar[i]);
	    }
	    
	    int f=0;
	    for(int i=1;i<=ar.length;i++)
	    {
	    	if(!set.contains(i))
	    	{
	    		f=i;
	    	}
	    		
	    }
	    
	    System.out.println(f);
	    //n*(n+1)/2 sum of first n natural number

	}

}
