package Algorithm;

import java.util.Arrays;

public class Selctionsort {
   public static void main(String[] args)
   {
	   int[] arr= {3,7,5,2,8};
	   sort(arr);
	   System.out.println(Arrays.toString(arr));
	   
   }

private static void sort(int[] arr) {
	for(int i=0;i<arr.length;i++)
	{
		int last=arr.length-1-i;
		int max=max(arr,0,last);
		swap(arr,max,last);
	}
	
}

private static void swap(int[] arr,int max, int last) {
	int temp=arr[max];
	arr[max]=arr[last];
	arr[last]=temp;
	
}

private static int max(int[] arr, int start, int last) {
   int max=0;
	for(int i=1;i<=last;i++)
	{
	     if(arr[max]<arr[i])
	     {
	    	 max=i;
	     }
	}
	return max;
}
	

}
