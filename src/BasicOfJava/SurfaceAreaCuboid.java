package BasicOfJava;

public class SurfaceAreaCuboid {
    static void main(String[] args) {
        double l,b,h,area;
        l=10;
        b=20;
        h=15;
        area = 2*(l*b + b*h + l*h);
        System.out.println("Total surface area of the cuboid is : " +area);
    }
}
