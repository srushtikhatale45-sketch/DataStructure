package BasicOfJava;

import java.util.Scanner;

public class SumofNumber {
    static void main(String[] args) {
        int a,b,c,sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of Number a:");
         a = sc.nextInt();
        System.out.print("\nEnter value of Number b:");
         b=sc.nextInt();
        System.out.print("\nEnter value of Number c:");
         c=sc.nextInt();
         sum = a+b+c;
        System.out.println("Sum of the numbers is:"+ sum);



    }
}
