package IfElseInJava;

import java.util.Scanner;

public class MagnitudeOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int num = -n;
        if(num>0 && num==69){
            System.out.println("The number is Equal to 69");
        }
        else{
            System.out.println("The number is  smaller than 69");
        }

    }
}
