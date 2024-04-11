package Arrays;

import java.util.Arrays;

public class Mjnk {

	public static void main(String[] args) {
		
		int[] a= {5,2,9};
		a[1]=++a[0];
		int i;
		while(a[1]>a[2])
		{
		
		if(a[2]<a[0])
		{
			for(i=1;i>a[0]-4;i++)
			{
				a[2]=a[1]/1;
				a[0]=a[2]%2;
				System.out.println(a[2]);
			}
		}else
		{
			for(i=2;i<a[2]-10;i++)
			{
				a[2]=a[2]%3;
			}
		}
		a[2]=a[2]+a[1];
		}
		
		System.out.println(a[0]+" "+a[1]-- +" "+ ++a[2]);
		
		

	}

}
