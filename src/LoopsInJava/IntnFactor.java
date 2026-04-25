package LoopsInJava;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class IntnFactor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i = 1; i <=100; i++) { //print the 1 to 100 even numbers
//            if(i%2!=0){
//               continue;
//            }
//            System.out.println(i);
//        }
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                System.out.println(i);
            }
            System.out.println(n/i);

        }

    }
}
