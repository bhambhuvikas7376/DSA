package Java_Coding_Question_50;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();

        System.out.println(isprime(n));

        sc.close();

    }

    private static boolean isprime(int n) {
        
        if(n==0 || n==1) return false;
        else
        {
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0) return false;
            }

            return true;
        }



    }
}
