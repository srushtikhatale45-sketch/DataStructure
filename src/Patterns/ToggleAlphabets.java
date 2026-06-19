package Patterns;

import java.util.Scanner;

public class ToggleAlphabets {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            if (i%2!=0){
                for (int j = 1; j <=i ; j++) {
                    System.out.print((char)(i+96)+" ");
                }
            }
            else{
                for (int j = 1; j <=i ; j++) {
                    System.out.print((char)(i+64)+" ");
                }
            }

            System.out.println();
        }

    }
}
