package BasicOfJava;

import java.util.Scanner;

public class CommentsJava {
    static void main(String[] args) {
//        this is the first way of the comment
        /*
        This is the second way of the comments
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");

        double number = sc.nextDouble();
        System.out.println("The Number is "+ number);
    }
}
