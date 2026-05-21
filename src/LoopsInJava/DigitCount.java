package LoopsInJava;

import java.util.Scanner;

public class DigitCount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int count =0;
        if(n==0) n=7;
        while(n!=0){
            n/=10;
            count ++;
        }
        System.out.println(count);
    }
}
