package Java_Coding_Question_50;

import java.util.Scanner;

public class Stringcontainsvowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        s.toLowerCase();
        boolean vowel=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i' || s.charAt(i)== 'o' || s.charAt(i)== 'u' )
            {
                     vowel=true;
                     break;
                     
            }
            
        }

        if(vowel) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }
}


//toLowerCase().matches(".*[aeiou].*");