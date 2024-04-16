package Java_Coding_Question_50;

import java.util.Scanner;

public class factorialofanumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(fact(n));
        System.out.println(fact1(n));
    }

    private static int fact1(int n) {
       int fact=1;

       for(int i=1;i<=n;i++)
       {
            fact=fact*i;
       }

       return fact;
    }

    private static int fact(int n) {
        if(n==0 || n==1) return 1;
        else return n*fact(n-1);
    }

    
}
