package SingletonDesignPattern;

public class SingletonSynchronizedgetInstance {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {

			@SuppressWarnings("unused")
			public void run() {
          	   Db obj1=Db.getInstance();
			}
		});
		
		Thread t2=new Thread(new Runnable() {

			@SuppressWarnings("unused")
			public void run() {
          	   Db obj2=Db.getInstance();
			}
		});
		
		t1.start();
		t2.start();
		
		
	}

}

class Db
{
	static Db obj;
	
	private Db()
	{
		System.out.println("Instance created");
	}
	
	public static synchronized Db getInstance()
	{
		if(obj==null)
		{
			obj=new Db();
		}
		
		return obj;
	}
}
