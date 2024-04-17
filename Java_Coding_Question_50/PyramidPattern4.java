package Java_Coding_Question_50;

import java.util.Scanner;

public class PyramidPattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i+1;j++) System.out.print("  ");

            for(int k=0;k<i+1;k++) System.out.print(k+1+" ");

            for(int l=i;l>0;l--) System.out.print(l+" ");

            System.out.println();
        }

        sc.close();
    }
}
