package Java_Coding_Question_50;

/**
 * Swap_number_wihtout_third_variable
 */
public class Swap_number_wihtout_third_variable {
    public static void main(String[] args) {
        int a=5;
        int b=10;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a:"+a+" b:"+b);
    }
    
}