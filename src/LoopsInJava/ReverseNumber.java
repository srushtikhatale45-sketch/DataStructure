package LoopsInJava;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int n = sc.nextInt();
        int r =0;
        while(n!=0){
            r*=10;
            r+=(n%10);
            n/=10;
        }
        System.out.println(r);
    }
}
