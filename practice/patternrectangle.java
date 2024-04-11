
/*package practice;

import java.util.Scanner;

public class patternrectangle {

	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       int n;
	       int m;
	       n=sc.nextInt();
	       m=sc.nextInt();
	       for(int i=1;i<=n;i++)
	       {
	    	   for(int j=1;j<=m;j++)
	    	   {
	    		   System.out.print("*"+" ");
	    	   }
	    	   System.out.println();
	       }

	}

}*/
//
package practice;

import java.util.Scanner;

public class patternrectangle {

	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       int n;
	       int m;
	       n=sc.nextInt();
	       m=sc.nextInt();
	       for(int i=1;i<=n;i++)
	       {
	    	   for(int j=1;j<=m;j++)
	    	   {
	    		   if(i==1||j==1||i==n||j==m)
	    		   {
	    			   System.out.print("*");
	    		   }
	    		   else
	    		   {
	    			   System.out.print(" ");
	    		   }
	    	   }
	    	   System.out.println();
	       }

	}

}
