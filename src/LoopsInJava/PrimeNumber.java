package LoopsInJava;

import java.util.Scanner;

public class PrimeNumber {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        boolean x = true;
        for (int i = 0; i <=n ; i++) {
            if(i%n!=0){
                x=false;
                System.out.println("The number is prime");
                break;
            }
            if(n==1) System.out.println("the number is neither prime nor composite");
            if(x=true) System.out.println("The number is composite");
            if(x=false) System.out.println("The number is composite");


        }
    }
}
