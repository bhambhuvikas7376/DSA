package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Quicksort1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<ar.length;i++) { ar[i]=sc.nextInt();}
		System.out.println(Arrays.toString(ar));
		int s=0;
		int e=ar.length-1;
		quick(ar,s,e);
		System.out.println(Arrays.toString(ar));

	}

	private static void quick(int[] ar, int l, int h) {
		
		if(l<h)
		{
	
		int p=partition(ar,l,h);
		quick(ar,l,p-1);
		quick(ar,p+1,h);	
		}
		
		
	}

	private static int partition(int[] ar, int l, int h) {
		int pi=ar[h];
		int i=l-1;
		
		for(int j=l;j<h;j++)
		{
			if(ar[j]<pi)
			{
				i++;
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		
		i++;
		
		int temp=ar[i];
		ar[i]=ar[h];
		ar[h]=temp;
		
		return i;
		
		
	}

}
