package basic;

public class static2 {
	 
    
    
 
    
     static class A {
    	
		private String name;
        
    	public A(String name)
    	{
    		this.name=name;
    	}
    	
        public void printMessage()
        {
        	
        	A Z=new A("yuvraj");
        	A P=new A("zzzz");
            System.out.println(Z.name);
        	System.out.println(P.name);
        }
    }
 
     public static void main(String args[])
     {
  
         
         A printer= new A("chankit");
         System.out.println(printer.name);
         static2.A print=new static2.A("CHNALIT");
         
         print.printMessage();
         
  
         
     }
    
}
 

 
