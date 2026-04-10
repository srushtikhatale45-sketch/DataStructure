package IfElseInJava;

import java.util.Scanner;

public class AbsoluteNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer input:");
        int n = sc.nextInt();
        if(n>=0){
            System.out.println(n);
        }
        else {
            System.out.println(-n);
        }
//        if(n<0)= -n;
//        System.out.println(n);
    }
}
