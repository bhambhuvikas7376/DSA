package Arrays;
import java.util.Arrays;
import java.util.Scanner;

/*public class Maxinarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(max(arr));

		}

private static int max(int[] arr) {
		int max=arr[0];
	for(int i=arr[0];i<=arr.length-1;i++)
	{
		if(arr[i]>arr[0])
		{
			max=arr[i];
		}
		
	}
	return max;
		
		}

	}*/

public class Maxinarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println(max(arr,1,2));
		
}

	private static int max(int[] arr, int a, int b) {
		int max=arr[a];
		for(int i=a;i<=b;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		return max;
	}
}