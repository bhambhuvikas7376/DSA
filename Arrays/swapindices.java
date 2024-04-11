package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class swapindices {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int[] arr=new int[5];
		  for(int i=0;i<arr.length;i++)
		  {
			  arr[i]=sc.nextInt();
		  }
		  int a =sc.nextInt(),b=sc.nextInt();
		  swap(arr,a,b);
		  System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
		
		
	}

}
