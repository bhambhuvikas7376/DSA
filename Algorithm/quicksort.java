package Algorithm;

import java.util.Arrays;

public class quicksort {

	public static void main(String[] args) {
		int[] ar= {1,2,7,3,9,5,2,5,7,9,5,6,7};
		
		int l=0;
		int h=ar.length-1;
		
		quicksortt(ar,l,h);
		System.out.println(Arrays.toString(ar));

	}

	private static void quicksortt(int[] ar, int l, int h) {
		if(l<h)
		{
			int pi=partition(ar,l,h);
			quicksortt(ar,l,pi-1);
			quicksortt(ar,pi+1,h);
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
