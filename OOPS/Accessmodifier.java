package OOPS;

public class Accessmodifier {

	public static void main(String[] args) {
		
	A obj=new A(34,"vikas");
	obj.setnum(34);
	int a =obj.getnum();
	System.out.println(a);
	}
	
	
}

 class A{
	private int num;
	String s;
	
	public int getnum()
	{
		return num;
	}
	public void setnum(int num)
	{
		this.num= num;
	}
	
	
	
	
	public A()
	{
		
	}
	public  A(int num,String s)
	{
		this.num=num;
		this.s=s;
	}
}
 
	



