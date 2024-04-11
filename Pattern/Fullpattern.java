package Pattern;
import java.util.*;
public class Fullpattern {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		 
		for(int i=0;i<n/2;i++)
		{
			for(int k=0;k<n-(i+3);k++)
			{
				System.out.print(" ");
			}
			for(int l=0;l<2*i+1;l++)
			{
				System.out.print("*");
			}
			System.out.println();
	
			for(int m=n-(i+3);m>0;m--)
			{
				System.out.print(" ");
			}
			for(int q=2*i+1;q<=(n-i);q--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		}
}
