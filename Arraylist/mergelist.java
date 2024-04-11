package Arraylist;

import java.util.ArrayList;

public class mergelist {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		
		ArrayList<Integer> merge=new ArrayList<Integer>(list1);
		merge.addAll(list2);
		
		System.out.println(merge);

	}

}
