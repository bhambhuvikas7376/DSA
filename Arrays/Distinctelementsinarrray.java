package Arrays;

import java.util.Arrays;

public class Distinctelementsinarrray {

	public static void main(String[] args) {
		int[] a= {1,2,3,1,2,3,4,5,6,8,9};
		int[] a2=new int[a.length];
		
		int index=0;

		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0) {
				a2[index]=a[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(a2));
	}

}
