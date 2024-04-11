package SingletonDesignPattern;

public class SingletonDoubleCheckedLocking {

	public static void main(String[] args) {
		

		Thread t1=new Thread(new Runnable() {

			public void run() {
          	   Db1 obj1=Db1.getInstance();
			}
		});
		
		Thread t2=new Thread(new Runnable() {

			public void run() {
          	   Db1 obj2=Db1.getInstance();
			}
		});
		
		t1.start();
		t2.start();
		
		
	}

}

class Db1
{
	static Db1 obj;
	
	private Db1()
	{
		System.out.println("Instance created");
	}
	
	public static Db1 getInstance()
	{
		if(obj==null)
		{
			synchronized(Db1.class)
			{
				if(obj==null) 
				{
					obj=new Db1();
				}
			}
			
		
		}
		return obj;
	}
}
