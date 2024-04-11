package OOPS;

//import java.security.PublicKey;

class M{
	 int num;
	 String s;
	
	public M(int num,String s) {
		this.num=num;
		this.s=s;
	}
}

 class B extends M{
      int c;
    
	public B(int num, String s,int c) {
		super(num, s);
		this.c=c;
	}
}

class inheritance {

	public static void main(String[] args) {
		
    B obj=new B(34,"vikas",66);
    System.out.println();
 
    System.out.println(obj.num);
	}
	
	
	
	
}

 
