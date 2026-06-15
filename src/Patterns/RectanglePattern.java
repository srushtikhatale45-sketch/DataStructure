package Patterns;

import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows to print the patterns :");
        int rows = sc.nextInt();
        System.out.print("Enter Number of Columns to print the patterns :");
        int column = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < column ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
