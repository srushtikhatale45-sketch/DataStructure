package LoopsInJava;

import java.util.Scanner;

public class PrimeNumber {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean x = true;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                x = false;
                break;
            }
        }
            if(n==1) System.out.println("the number is neither prime nor composite");
            else if(x==false) System.out.println("The number is composite");
            else System.out.println("The number is prime");



    }
}
