package LoopsInJava;

import java.util.Scanner;

public class SumDigitCount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(n==0) n=1;
        int sum=0;
        while(n!=0){
            sum+=(n%10);
            n/=10;

        }
        System.out.println((sum > 0)? sum :(-sum));

    }
}
