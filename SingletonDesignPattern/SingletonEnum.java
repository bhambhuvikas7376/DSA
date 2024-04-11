package SingletonDesignPattern;

public class SingletonEnum {

	public static void main(String[] args) {
		
		Db2 obj1=Db2.INSTANCE;
		obj1.i=5;
		obj1.show();
		
		Db2 obj2=Db2.INSTANCE;
		obj2.i=6;
		
		obj1.show();
	}

}

enum Db2
{
	INSTANCE;
	int i;
	public void show()
	{
		System.out.println(i);
	}
}
