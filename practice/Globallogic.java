package practice;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Globallogic {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(sorts(n,arr));

	}

	private static int sorts(int n, int[] arr) {
	   int[] arr2=new int[n];
	   System.arraycopy(arr,0,arr2,0, n);
		Arrays.sort(arr);
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<n;i++)
		{
				if(arr[i]==arr2[i])
				{
					sum1=sum1+arr[i];
				}else
				{
					sum2+=arr[i];
				}
		}
		
		return sum1-sum2;
		
	
	}
}
