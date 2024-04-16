package Java_Coding_Question_50;

public class OnlyOddNumbers {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[] ar={1,4,3,9,5};
        boolean onlyodd=true;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]%2==0)
            {
                onlyodd=false;
                break;
            }
        }

        if(onlyodd) System.out.println("Yes");
        else System.out.println("No");



    }
}