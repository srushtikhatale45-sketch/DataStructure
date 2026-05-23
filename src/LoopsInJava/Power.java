package LoopsInJava;

import java.util.Scanner;

public class Power {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a :");
        int a =sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int power = 1;
        for (int i =1 ; i<b;i++){
            power*=a;
        }
        System.out.println(power);
    }
}
