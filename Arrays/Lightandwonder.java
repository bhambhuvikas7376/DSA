package Arrays;


import java.util.*;
public class Lightandwonder {

	public static void main(String[] args) {
		Integer[] a= {2,2,3,1,1};
		List<Integer> list=Arrays.asList(a);
		//List<Integer> list1=sort(list);
		  Integer[] a1 = list.toArray(new Integer[0]);
		System.out.println(Arrays.toString(a1));
		HashMap<Integer,Integer> hashmap=new HashMap<>();
		int[] a2=new int[10];
		int sum=0;
        for(int i=0;i<=a1.length;i++)
        {
        	for(int j=0;j<i;j++)
        	{
        		a2[j]=a1[j];
        		hashmap.put(a2[j],j);
        	}
        	sum=sum+hashmap.size();
        }
        
        System.out.println(sum);
       
      
	}
           
	@SuppressWarnings("unused")
	private static List<Integer> sort(List<Integer> list) {
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<list.size();i++)
		{
			map.put(list.get(i),map.getOrDefault(list.get(i), 0)+1);
		}
		
		Collections.sort( list,(n1,n2)->{
			int freq1=map.get(n1);
			int freq2=map.get(n2);
			
			if(freq1 != freq2)
			{
				return freq2-freq1;
			}
			else return n1-n2;
		});
		
		return list;
	}

}