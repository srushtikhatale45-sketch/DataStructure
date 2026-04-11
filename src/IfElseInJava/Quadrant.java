package IfElseInJava;

import java.util.Scanner;

public class Quadrant {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the point x :");
        int x = sc.nextInt();
        System.out.print("Enter the point y :");
        int y = sc.nextInt();

        if(x==0 && y>0){
            System.out.println("The point lies on y axis");
        }
        if(x>0 && y==0){
            System.out.println("The point lies on x axis");
        }
        if(x==0 && y==0){
            System.out.println("Point lies at origin");
        }
       else if(x>0 && y>0){
            System.out.println("The point lies on 1 st Quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("The point lies on 2 st Quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("The point lies on 3 rd Quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("The point lies on 4 th Quadrant");
        }
    }
}
