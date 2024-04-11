package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

/*public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		int target=4;
		
		System.out.println(binary(arr,target));
	}

	private static int binary(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		
		
		while(start<=end)
		{
			int mid= start+(end-start)/2;
			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else {
				return mid;
			}
		}
		 return -1;
		
		
	}

}*/

public class BinarySearch{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr= {9,12,5,2,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the element to search: ");
		int target=sc.nextInt();
		int z = sreach(arr,target);
		System.out.println(z);
	}

	private static int sreach(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+((end-start)/2);
			
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				return mid;
			}
			
		}
		return -1;
		
		
	}
}
