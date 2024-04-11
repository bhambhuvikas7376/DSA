package Algorithm;

import java.util.*;
public class practiceprogrames {

	public static void main(String[] args) {
		int k=6;
		int[] arr= {0,1,1,0,0,2,2,1,0,1};
	   
	     int[] c=two(arr);
	     System.out.println(Arrays.toString(c));
	        
	}

	private static int[] two(int[] arr) {
		int lo=0;
		int mid=0;
		int high=arr.length-1;
		int temp;
		while(mid<=high) {
			switch(arr[mid])
			{
			case 0:
				temp=arr[lo];
				arr[lo]=arr[mid];
				arr[mid]=temp;
				mid++;
				lo++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
				break;
		}			
	}
		return arr;
	}
	}
	
	






