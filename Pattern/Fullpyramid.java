package Pattern;
import java.util.Scanner;
public class Fullpyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n-i+1;j++)
			{
				System.out.print(" ");
			}
			/*for(int j=0,k=i;j<2*i+1;j++)
			{
				if(k<2*i+1)
				{
					System.out.print(k+1);
					k++;
				}
				else
				{
					System.out.print(k-1);
					k--;
				}
			}
			System.out.println();*/
			for(int k=i;k<=2*i;k++)
			{
				System.out.print(k+1);
			}
		    for(int l=i*2;l>=i+1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
