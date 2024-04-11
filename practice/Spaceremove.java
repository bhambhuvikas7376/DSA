package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Spaceremove {

	public static void main(String[] args) {
		String str="  vikas bhambhu ";
		
		str=str.replaceFirst("^\\s+","");
		System.out.println(str);
		str=str.replaceFirst("\\s+$","");
		System.out.println("\""+str+"\"");
		
	
		
	}
}


