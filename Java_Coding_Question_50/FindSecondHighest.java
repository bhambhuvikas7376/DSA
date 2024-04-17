package Java_Coding_Question_50;

public class FindSecondHighest {
    public static void main(String[] args) {
        int[] ar={1,2,3,5,7,8,6,4,99,8,6,55,8,6,76,3,399,76,45,677,8};
        int max=0;
        int smax=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max)
            {
                smax=max;
                max=ar[i];
            }
            else if(ar[i]<=max && ar[i]>smax) smax=ar[i];
        }

        System.out.println(smax);
    }
}
