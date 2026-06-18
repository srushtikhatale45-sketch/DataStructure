package Patterns;

import java.util.Scanner;

public class GivenNumberPattern {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print( i+ " ");
            }
            System.out.println();

        }
    }
}
