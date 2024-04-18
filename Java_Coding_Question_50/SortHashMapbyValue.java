package Java_Coding_Question_50;
import java.util.*;
import java.util.Map.Entry;
public class SortHashMapbyValue {
    public static void main(String[] args) {
    HashMap<String,Integer> map=new HashMap<>();
    map.put("chankit", 7);
    map.put("vikas", 8);
    map.put("aditya",18);

    System.out.println(map);

    map=sortmap(map);

    System.out.println(map);


    }

    private static HashMap<String,Integer> sortmap(HashMap<String, Integer> map) {

        HashMap<String,Integer> sortMap=new LinkedHashMap<>();

        Set<Entry<String,Integer>> entryset=map.entrySet();
        System.out.println(entryset);

        List<Entry<String,Integer>> sortList=new ArrayList<>(entryset);
        System.out.println(sortList);

        sortList.sort((x,y)-> x.getValue().compareTo(y.getValue()));
        System.out.println(sortList);

        for(Entry<String,Integer> e: sortList)
        {
            sortMap.put(e.getKey(),e.getValue());
        }

        return sortMap;






        
    }
}


/*Map<String, Integer> scores = new HashMap<>();

scores.put("David", 95);
scores.put("Jane", 80);
scores.put("Mary", 97);
scores.put("Lisa", 78);
scores.put("Dino", 65);

System.out.println(scores);

scores = sortByValue(scores);

System.out.println(scores);
}

private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
Map<String, Integer> sortedByValue = new LinkedHashMap<>();

// get the entry set
Set<Entry<String, Integer>> entrySet = scores.entrySet();
System.out.println(entrySet);

// create a list since the set is unordered
List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
System.out.println(entryList);

// sort the list by value
entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
System.out.println(entryList);

// populate the new hash map
for (Entry<String, Integer> e : entryList)
    sortedByValue.put(e.getKey(), e.getValue());

return sortedByValue;
}*/
