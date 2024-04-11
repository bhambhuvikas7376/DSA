package OOPS;

//public class First {
//		static int a=4;
//		 void number()
//		{
//			a--;
//			if(a==0)
//			{
//				return ;
//			}
//			number();
//		}
//	public static void main(String[] args) {
//		
//		new First().number();
//	}
//
//}
public class First {
	
	public void mymethod()
	{
		System.out.println("method");
	}
	{
		System.out.println("x");
	}
	
	public void First()
	{
		System.out.println("constructer");
	}
	
	static
	{
		System.out.println("static");
	}
public static void main(String[] args) {
	First sc=new First();
	sc.First();
	sc.mymethod();
	
}

}
