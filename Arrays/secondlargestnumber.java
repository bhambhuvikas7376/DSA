package Arrays;

import java.time.LocalDate;

public class secondlargestnumber {

	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,6,8,5,4};
		int h=Integer.MIN_VALUE;
		int sh=Integer.MIN_VALUE;
		
		for(int i:ar)
		{
			if(i > h)
			{
				sh=h;
				h=i;
			}
			else if(i > sh)
			{
				sh=i;
			}
		}
		
		System.out.println(sh);
		
		LocalDate date=LocalDate.now();
		System.out.println(date);

	}

}
