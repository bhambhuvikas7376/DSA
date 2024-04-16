package Java_Coding_Question_50;

import java.util.Scanner;

public class Stringpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean palindrome=true;
        for(int i=0,j=s.length()-1;i<j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                palindrome=false;
                break;
            }
        }

        if(palindrome) System.out.println("Yes");
        else System.out.println("No");

        sc.close();



    }
    
}