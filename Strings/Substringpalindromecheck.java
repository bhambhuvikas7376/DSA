package Strings;

public class Substringpalindromecheck {

	public static void main(String[] args) {
	 String str="abc";
	 char[] ch=str.toCharArray();
	 String srt1="";
	 StringBuilder sb=new StringBuilder();
	 
	 for(int i=0;i<str.length();i++)
	 {
		 for(int j=i+1;j<=str.length();j++)
		 {
			 String ss=str.substring(i,j);
			 System.out.println(ss);
		 }
		 System.out.println();
	 }
	
	}

}
