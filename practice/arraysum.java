package practice;

import java.util.Arrays;
import java.util.Scanner;

public class arraysum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double[] arr=new double[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextDouble();
		}
		  
       
	    int[] b=sumzero(arr);
		System.out.println(Arrays.toString(b));
	}

	private static int[] sumzero(double[] arr) {
		int sumpositive=0;
		int sumnegative=0;
	for(int i=0;i<arr.length;i++)
	{
		double element =arr[i];
		
		if(element>=0)
		{
			sumpositive+= Math.floor(element);
		}else
		{
			sumnegative+=Math.ceil(element);
		}
	}
	    if(sumpositive+sumnegative==0)
	    {
	    	int[] b=new int[arr.length];
	    	
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		double element=arr[i];
	    		
	    		if(element>=0)
	    		{
	    			b[i]=(int) Math.floor(arr[i]);
	    		}else
	    		{
	    			b[i]=(int) Math.ceil(arr[i]);
	    		}
	    		
	    	}
	    	return b;
	    }
	    return null;
		
	}

}
