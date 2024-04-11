package practice;

import java.util.Scanner;

public class Singledigit {

	@SuppressWarnings("resource")
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt();
		int n = (int)Math.pow(M, 2);
	    int sum = 0;
	    while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);    
	       
		}
		}
		

	


