package BasicOfJava;

import java.util.Scanner;

public class AreaOfSphere {
    static void main(String[] args) {
        double r;
        double area;
        double pi;
        pi=3.1415;
        r=5;
        area = 4/3 * pi * r * r *r;
        System.out.println("volume of the sphere having radius " + r +" :  "+ area);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Radius of the Sphere : ");
//        double rs = sc.nextDouble();
//        double areas = (4/3)*3.1415*rs*rs*rs;
//        System.out.println("The area of the sphere is" + areas);

    }
}
