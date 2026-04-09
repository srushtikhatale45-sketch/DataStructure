package BasicOfJava;

import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the priciple here:" );
        double principle = sc.nextDouble();
        System.out.print("\nEnter the rate here:");
        double rate = sc.nextDouble();;
        System.out.print("\nEnter the time here:" );
        double time = sc.nextDouble();


        double simpleInterest = (principle * rate *time)/100;
        System.out.print("The Simple Interest is present here : "+ simpleInterest);

    }
}
