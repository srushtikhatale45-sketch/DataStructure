package BasicOfJava;

import java.util.Scanner;

public class AreaOfCircle {
    static void main(String[] args) {
        //Area of the circle =pi*r*r
//        double r ;
//        r=20;
//        double pi=3.1415;
//        double area = pi * r * r;
//        System.out.println("Area of the circle is having radius "+ r +" : " + area );


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double rc = sc.nextDouble();
        double area1 = 2*3.1415*rc;
        System.out.println("Area Of the Circle is :" + area1);

    }
}
