package Arrays;

import java.util.Arrays;

public class Array2dto1d {

	public static void main(String[] args) {
		int[] a=new int[9];
		int[][] a1= {
				{3,2,1},
				{4,2,5},
				{6,1,8}};
		int n=3,m=3;
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				k=j+i*m;
				a[k]=a1[i][j];
				k++;
			}
		}
		System.out.println(Arrays.toString(a));

		   
	}

}
