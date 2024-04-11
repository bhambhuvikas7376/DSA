package Algorithm;
import java.util.*;

public class Mergesort1 {

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
		merge(ar,s,e);
		System.out.println(Arrays.toString(ar));
		
		
	}

	private static void merge(int[] ar,int s,int e) {
		
		
		if(s>=e)
		{
			return;
		}
		
		int mid=s+(e-s)/2;
		
		merge(ar,s,mid);
		merge(ar,mid+1,e);
		con(ar,s,mid,e);
	
	}

	private static void con(int[] ar, int s, int mid, int e) {
		int[] ar1=new int[e-s+1];
		
		int ind1=s;
		int ind2=mid+1;
		int x=0;
		
		while(ind1<=mid && ind2<=e)
		{
			if(ar[ind1]<=ar[ind2])
			{
				ar1[x++]=ar[ind1++];
			}
			else
			{
				ar1[x++]=ar[ind2++];
			}
		}
		
		while(ind1<=mid)
		{
			ar1[x++]=ar[ind1++];
		}
		
		while(ind2<=e)
		{
			ar1[x++]=ar[ind2++];
		}
		
		for(int i=0,j=s;i<ar1.length;i++,j++)
		{
			ar[j]=ar1[i];
		}
		
	}

}
