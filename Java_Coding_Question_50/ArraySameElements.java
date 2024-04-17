package Java_Coding_Question_50;
import java.util.*;
public class ArraySameElements {
   public static void main(String[] args) {
    Integer[] ar1={1,2,3,4,5};
    Integer[] ar2={1,2,3,4,5};
    //boolean s=true;
    //s=Arrays.equals(ar1,ar2);
    System.out.println(arrayequal(ar1,ar2));
    
   }

private static boolean arrayequal(Integer[] ar1, Integer[] ar2) {
    HashSet<Integer> set1=new HashSet<>(Arrays.asList(ar1));
    HashSet<Integer> set2=new HashSet<>(Arrays.asList(ar2));

    if(set1.size()!=set2.size()) return false;

    for(Integer n : set1)
    {
        if(!set2.contains(n)) return false;
    }

    return true;



}
}
