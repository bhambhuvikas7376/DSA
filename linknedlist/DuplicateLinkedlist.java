package linknedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class DuplicateLinkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(4);
		System.out.println(list);
		
		reomve(list);
		
		System.out.println(list);

	}

	private static void reomve(LinkedList<Integer> list) {
		int[] ar=new int[list.size()];
		Arrays.fill(ar, 0);
		
		
		for(int i=0;i<list.size();i++)
		{
			if(ar[list.get(i)]!=0)
			{
				list.remove(i);
			}
			else
			{
				ar[list.get(i)]=1;
			}
		}
		
	}

}
