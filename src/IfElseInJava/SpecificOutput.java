package IfElseInJava;

import java.util.Scanner;

public class SpecificOutput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("Aryan");
        }
         else if(n%3==0){
            System.out.println("Ranu");
        }
        else if(n%5==0){
            System.out.println("Riya");
        }
        else {
            System.out.println("Isha");
        }
    }
}
