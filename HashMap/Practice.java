package HashMap;

import java.util.HashMap;

public class Practice {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<>();
		
		map.put(183,1);
	    map.put(150,2);
		map.put(190, 3);
		
		System.out.println(map);
		
		System.out.println(map.containsKey(183));
		
		System.out.println(map.get(183));
	}

}
