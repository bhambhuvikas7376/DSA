package Pattern;
import java.util.*;

public class Interviewpattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		
		for(int i=0;i<n;i++)
		{
		    if(i%2!=0)
			{
				System.out.print(" ");
				System.out.println("*");
			}
			else if(i%2==0 && count%2==0)
			{
				System.out.print("");
				System.out.println("*");
				count=count+1;;
			}
			else if(i%2==0 && count%2!=0)
			{
				System.out.print("  ");
				System.out.println("*");
				count=count+1;
			}

		}

	}

}
