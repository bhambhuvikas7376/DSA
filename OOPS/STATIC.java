package OOPS;


public class STATIC {

		static int a=10;
		
		static int b;
		
		static{
			System.out.println("hello world");
			b=a*4;
		}
	public static void main(String[] args) {
		STATIC sc=new STATIC();
		//System.out.println(sc.a+ " " +sc.b);
		System.out.println(STATIC.a + " " + STATIC.b);
	}
 }
	


/*public class STATIC{
	public static void main(String[] args)
	{
		Human kunal=new Human(18,"kunal",435);
		System.out.println(kunal.age);
		
	}

}
class Human{
	int age;
	String name;
	int salary;
	static int population;
	
	public Human()
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		Human.population +=1;
	}
}
*/
