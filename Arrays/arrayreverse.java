
 package Arrays;

 import java.util.Arrays;
 import java.util.Scanner;

 public class arrayreverse  {

 	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
 		 int[] arr=new int[5];
 		  for(int i=0;i<arr.length;i++)
 		  {
 			  arr[i]=sc.nextInt();
 		  }
 		  
 		  reverse(arr);
 		  System.out.println(Arrays.toString(arr));

 	}

 	private static  void reverse(int[] arr) {
 		int start =0,end=arr.length-1;
 		while(start<end)
 		{
 			swap(arr,start,end);
 			start++;
 			end--;
 		}

		
	}

	private static void swap(int[] arr,int a,int b) {
 		
 		{
 			int temp=arr[a];
 	 		arr[a]=arr[b];
 	 		arr[b]=temp;
 		}
		
 		
 		
 		
 		
 	}

 }

	
