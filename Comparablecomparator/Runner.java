package Comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {

	public static void main(String[] args) {
		ArrayList<laptop> list=new ArrayList<laptop>();
		list.add(new laptop("asus",8,10));
		list.add(new laptop("dell",4,8));
		list.add(new laptop("apple",12,15));
		
		Comparator<laptop> com=new  Comparator<laptop>() {
			@Override
			public int compare(laptop o1, laptop o2) {
				
				if(o1.getprice()>o2.getprice()) return 1;
				else return -1;
			}
		};
		
		Collections.sort(list,com);
		
		for(laptop l:list)
		{
			System.out.println(l);
		}

	}

}
