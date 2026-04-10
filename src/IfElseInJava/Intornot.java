package IfElseInJava;

import java.util.Scanner;

public class Intornot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");

        double num = sc.nextDouble();
        int n = (int)num;
        System.out.println(n);
        if(n-num==0) {
            System.out.println("The number is integer");
        }
        else {
            System.out.println("The number is not integer");
        }

    }
}
