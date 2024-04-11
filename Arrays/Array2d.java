package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr = {{1,2,3},{2,3,4},{3,4,5,6},{3,5,6}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(Arrays.toString(arr[i]));
		}
	}

}
