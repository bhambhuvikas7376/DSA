package Arrays;
import java.util.*;
//import java.util.Collections;
public class SortingofArrayDependingonFrequencyofElements {

	public static void main(String[] args) {
	int[] ar= {4,3,1,6,4,3,6,4};
	Arrays.sort(ar);
	int[][] ar1=new int[ar.length][2];
	
	int x=0;
	ar1[x][0]=ar[0];
	
	for(int i=1;i<ar.length;i++)
	{
		if(ar[i]==ar[i-1])
		{
			ar1[x][1]=ar1[x][1]+1;
		}
		else
		{
			x++;
			ar1[x][0]=ar[i];
		}
	}
	x++; //count the number in arr1 arrya
	
	sort(ar1,x);
	
	for(int i=0;i<x;i++)
	{
		for(int j=0;j<=ar1[i][1];j++)
		{
			System.out.print(" "+ar1[i][0]);		
		}
	}
	System.out.println("");
	
	}

	private static void sort(int[][] ar1,int x) {
		int[] c=new int[2];
		
		for(int i=0;i<x;i++)
		{
		for(int j=1;j<x-i;j++)
		{
			if(ar1[j][1]>ar1[j-1][1])
			{
				c=ar1[j];
				ar1[j]=ar1[j-1];
				ar1[j-1]=c;
			}
		}
		}
		
	}
}
