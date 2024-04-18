package Java_Coding_Question_50;
import java.util.*;

public class Twolistmerge {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        
        ArrayList<Integer> l3=new ArrayList<>(l1);
        l3.addAll(l2);

        System.out.println(l3);
        
    }
}
