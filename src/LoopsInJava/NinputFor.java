package LoopsInJava;

import java.util.Scanner;

public class NinputFor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int n;
        n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            System.out.println("Have a great day !!");
        }
    }
}
