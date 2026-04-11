package IfElseInJava;

import java.util.Scanner;

public class SidesOfTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side 1: ");
        int a =sc.nextInt();
        System.out.print("Enter the side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter the side 3: ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Invalid Triangle");
        }
    }
}
