package LoopsInJava;

import java.util.Scanner;

public class Inputn {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        for (int i = 1, j=n; i <= j; i++,j--) {
            System.out.println(i+ " ");
            if(i!=j){
                System.out.println(j + " ");
            }

        }
    }
}
