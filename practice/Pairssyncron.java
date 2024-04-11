package practice;

public class Pairssyncron {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		int c=5;
		int d=2;
		
		String str=ispossible(a,b,c,d);
		System.out.println(str);

	}
	static String ans="";
	private static void solver(int a,int b,int c,int d) {
		if(a==c && b==d)
		{
			ans="Yes";
		}
		if(a>c || b>d) return;
			
		solver(a+b,b,c,d);
		solver(a,a+b,c,d);
	}
	private static String ispossible(int a, int b, int c, int d) {
		solver(a,b,c,d);
		if(ans=="Yes")
		{
			return "Yes";
		}
		else {
			return "No";
		}
	}

	
		
	

}
