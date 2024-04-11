package Arrays;

public class Triplets {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int n=5;
		int count=0;
		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if((arr[i]+arr[j]+arr[k])%n==0)
					{
						count++;
						System.out.println(arr[i]+""+arr[j]+""+arr[k]);
					}
				}
			}
		}
		System.out.println(count);
		  /*int total=(2*n)-1;
	        
		    for(int i=0;i<(total/2)+1;i++)
		    {
		        for(int j=0;j<=i-1;j++)
		        {
		            System.out.print(n-j+" ");
		        }
		        for(int k=i;k<total-i;k++)
		        {
		            System.out.print(n-i+" ");
		        }
		        for(int l=n-i+1;l<=n;l++)
		        {
		            System.out.print(l+" ");
		        }
		        System.out.println();
		    }
		    
		    int x=total/2;
		    
		    for(int i=0;i<x;i++)
		    {
		        for(int j=n;j>=3+i;j--)
		        {
		            System.out.print(j+" ");
		        }
		        for(int k=0;k<3+(2*i);k++)
		        {
		            System.out.print(i+2+" ");
		        }
		        for(int l=x-2-i;l>=0;l--)
		        {
		            System.out.print(n-l+" ");
		        }
		        System.out.println();
		    }*/

	}

}
