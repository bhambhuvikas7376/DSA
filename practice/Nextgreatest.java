package practice;

import java.util.Arrays;

public class Nextgreatest {

	public static void main(String[] args) {
	   int[] arr= {-13,-2,-1,0,-1};
	   int[] arr2=new int[arr.length];
	   Arrays.fill(arr2, 0);
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=i;j<arr.length;j++)
		   {
			   if(arr[i] < arr[j]) {
				   arr2[i]=arr[j];
				   break;
			   }
		   }
		  
	   }
	   System.out.println(Arrays.toString(arr2));

	}

}
