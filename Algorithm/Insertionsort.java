package Algorithm;
import java.util.*;


public class Insertionsort{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		sort(ar);
		System.out.println(Arrays.toString(ar));
		
	}

	private static void sort(int[] ar) {
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(ar[j]<ar[j-1])
				{
					int temp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
				}
				else {
					break;
				}
			}
		}
		
	}
}