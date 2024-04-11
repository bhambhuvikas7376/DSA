package HashMap;
import java.util.*;
public class Majorityelement {

	public static void main(String[] args) {
		int num[]= {1,2};
		me(num);

	}

	private static void me(int[] num) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<num.length;i++)
		{
			if(map.containsKey(num[i]))
			{
				map.put(num[i], map.get(num[i])+1);
			}
			else
			{
				map.put(num[i], 1);
			}
		}
		
		for(int keys: map.keySet())
		{
			if(map.get(keys)>=num.length/3)
			{
				System.out.println(keys+"");
			}
		}
		
	}

}
