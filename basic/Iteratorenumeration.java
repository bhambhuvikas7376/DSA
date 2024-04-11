package basic;
import java.util.*;

public class Iteratorenumeration {
    enum level{
    	low,
    	medium,
    	high
    }
	public static void main(String[] args) {
		level i=level.medium;
		System.out.println(i);
		
		for(level var:level.values())
		{
			System.out.println(var);
		}
		
		
		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		
		Iterator it=set.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
		
	}

}
