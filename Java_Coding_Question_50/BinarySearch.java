package Java_Coding_Question_50;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] ar={1,8,4,3,8,6,9,3,5,7};
    int n=sc.nextInt();
    Arrays.sort(ar);
    System.out.println(binary(ar,n));
    sc.close();
}

    private static boolean binary(int[] ar, int n) {
        int s=0;
        int l=ar.length-1;

        while(s<=l)
        {
            int mid=s+(l-s)/2;

            if(ar[mid]<n)
            {
                s=mid+1;
            }
            else if(ar[mid]>n)
            {
                l=mid-1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    
}