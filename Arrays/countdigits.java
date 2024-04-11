package Arrays;

public class countdigits {

	public static void main(String[] args) {
		int num=5678;
//		int s=digits(num);
//		System.out.println(s);
		int s = countdigits(num);
		System.out.println(s);
	}

	private static int countdigits(int num) {
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		return count;
	}

//	private static int digits(int num) {
//		return (int)(Math.log10(num)+1);
//	}

}
