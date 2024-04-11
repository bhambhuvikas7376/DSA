package SingletonDesignPattern;

public class SingletonEagerType {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
       Abc obj1=Abc.getInstance();
	}

}

class Abc
{
	static Abc obj=new Abc();
	
	private Abc()
	{
		
	}
	
	public static Abc getInstance()
	{
		return obj;
	}
}