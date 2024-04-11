package practice;

import java.util.ArrayList;
import java.util.List;

public class function {

	public static void main(String[] args) {
	     ArrayList<Integer> arr=new ArrayList<>(5);
	     arr.add(1);
	     arr.add(2);
	     arr.add(3);
		int element=2;
		int position=4;
		//function1(arr,element,position);
		System.out.println(arr);

	}

	private static void function1(ArrayList<Integer> arr, int element, int position) {
	       arr.set(position, element);
	       
		
		
		
	}

}
