package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner num = new Scanner(System.in);
        String nn;
        do {
            System.out.println("Enter a number to see if it's in Fibonacci sequence: ");
            int number = num.nextInt();
            int N = 0;
            boolean ans = false;
            while (fibonacci(N) <= number) {
                if (fibonacci(N) == number) {
                    ans = true;
                    break;
                }
                N++;
            }
            if (ans) {
                System.out.print(number + " is a fabonacci number. Here are the numbers leading up to ");
                for (int i = 0; i <= N; i++) {
                    System.out.print(fibonacci(i) + ", ");
                }
            } else {
                System.out.println("Number '" + number + "' is not a fibonacci number!");
            }
            System.out.println("\nDo you want to enter another number? yes or no");
            nn = num.next();
        }while(nn.equalsIgnoreCase("yes"));
    }

    public static int fibonacci(int n)
    {
        if (n==0 || n==1)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }


}
