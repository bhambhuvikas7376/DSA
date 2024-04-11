package SingletonDesignPattern;

public class SingletonLazyType {

	public static void main(String[] args) {
		Abd obj1=Abd.getInstance();
	}

}

class Abd
{
	static Abd obj;
	
	private Abd()
	{
		System.out.println("Instance created");
	}
	
	public static Abd getInstance()
	{
		if(obj==null)
		{
			obj=new Abd();
		}
		
		return obj;
	}
}
