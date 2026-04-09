package BasicOfJava;

import java.util.Scanner;

public class SquareOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("The number is :");
        int number = sc.nextInt();

        int square = number * number;
        System.out.println("Square of the number is: "+ square);
    }
}
