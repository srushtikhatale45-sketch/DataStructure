package IfElseInJava;

import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Positive Integer Number:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("The number is Even.");
        }
        else{
            System.out.println("The number is odd.");
        }

//        Take positive integer input and tell if it is divisible by 5 or not
        System.out.print("Enter the Positive Integer Number:");
        int num1 = sc.nextInt();
        if(num1%5==0){
            System.out.println("The number is Divisible by 5.");
        }
        else{
            System.out.println("The number is not Divisible by 5.");
        }



    }
}
