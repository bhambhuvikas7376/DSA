package Arrays;
import java.util.*;

public class removeduplicates {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,1,2,3,4,5,6,7};
		
		HashSet<Integer> set=new HashSet<>();
		
		for(int i: arr) set.add(i);
		
		System.out.println(set);
		
		

	}

}
