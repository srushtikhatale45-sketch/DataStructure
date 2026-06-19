package Patterns;

import java.util.Scanner;

public class QuestionofAlphabet {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            char x;
            if(i%2!=0) {
                x = (char)(i+96);
            }
            else {
                x=(char)(i + 64);
            }
            for (int j = 1; j <=n; j++) {
                System.out.print(x+ " ");
            }

            System.out.println();
        }
    }
}
