package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Profitsyncron {

	public static void main(String[] args) {
		int[] arr= {5,7,9,13,11,6,6,3,3};
		int target=12;
		int n=uniquepairs(arr,target);
		System.out.println(n);

	}

	private static int uniquepairs(int[] arr, int target) {
		int count=0;
	Set<Integer> set=new HashSet<Integer>();
	Set<Integer> seen=new HashSet<Integer>();
	
	for(int num: arr)
	{
		if(set.contains(target-num) && !seen.contains(num)) {
			count++;
			seen.add(target-num);
			seen.add(num);
		}
		else if(!set.contains(num)) {
			set.add(num);
		}
	}
	
		return count;
		
	}

}
