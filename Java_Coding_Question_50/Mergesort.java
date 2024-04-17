package Java_Coding_Question_50;
import java.util.*;

public class Mergesort {
public static void main(String[] args) {
    int[] ar={1,6,4,8,4,9,5};
    int s=0;
    int e=ar.length-1;

    divide(ar,s,e);

    System.out.println(Arrays.toString(ar));
}

private static void divide(int[] ar, int s, int e) {
   
    if(s>=e)
    {
        return;
    }

    int mid=s+(e-s)/2;

    divide(ar, s, mid);
    divide(ar, mid+1, e);
    conquer(ar,s,mid,e);
}

private static void conquer(int[] ar, int s, int mid, int e) {
    int[] merge=new int[e-s+1];
    int ind1=s;
    int ind2=mid+1;
    int x=0;

    while(ind1<=mid && ind2<=e)
    {
        if(ar[ind1]<=ar[ind2]) merge[x++]=ar[ind1++];
        else merge[x++]=ar[ind2++];
    }

    while(ind1<=mid) merge[x++]=ar[ind1++];

    while(ind2<=e) merge[x++]=ar[ind2++];

    for(int i=0,j=s;i<merge.length;i++,j++) ar[j]=merge[i];
    

}
    
}