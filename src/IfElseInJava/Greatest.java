package IfElseInJava;

import java.util.Scanner;

public class Greatest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 st number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2 nd number: ");
        int n2 = sc.nextInt();
        System.out.println("Enter 3 rd number: ");
        int n3 = sc.nextInt();

        if(n1>n2 && n2>n3){
            System.out.println("The Greatest number is: "+n1);
        }
        else if(n2>n1 && n1>n3){
            System.out.println("The Greatest number is: "+n2);
        }
        else if(n3>n2 && n2>n1){
            System.out.println("The Greatest number is: "+n3);
        }
    }
}
