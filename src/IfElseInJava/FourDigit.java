package IfElseInJava;

import java.util.Scanner;

public class FourDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        if(n>999 && n<10000){
            System.out.println("The number is four Digit");
        }
        else System.out.println("The number  is not a four digit");
    }
}
