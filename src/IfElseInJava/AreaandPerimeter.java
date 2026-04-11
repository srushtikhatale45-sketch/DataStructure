package IfElseInJava;

import java.util.Scanner;

public class AreaandPerimeter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle:  ");
        int l = sc.nextInt();
        System.out.print("Enter the Breadth of Rectangle:  ");
        int b = sc.nextInt();

        int area = l*b;
        int perimeter = 2*(l+b);
        if (area> perimeter){
            System.out.println("The area "+ area +" of the Rectangle is greater than the Perimeter " + perimeter);
        }
        else {
            System.out.println("The area "+ area +" of the Rectangle is smaller than the Perimeter" + perimeter);
        }

    }
}
