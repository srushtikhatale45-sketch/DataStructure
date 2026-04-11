package IfElseInJava;

import java.util.Scanner;

public class NumberDivisibleby3or5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if (n%3==0 || n%5==0){
            System.out.println("The number is divisible by 5 or 3.");
        }
        else {
            System.out.println("The number is not divisible by 3 or 5. ");
        }
    }
}
